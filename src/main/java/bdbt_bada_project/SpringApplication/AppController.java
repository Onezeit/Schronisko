package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
public class AppController implements WebMvcConfigurer {


    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
    }
    @Controller
    public class DashboardController {
        @Autowired
        private ZwierzetaDAO dao;
        @RequestMapping("/main")
        public String defaultAfterLogin(HttpServletRequest request) {
            if
            (request.isUserInRole("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if (request.isUserInRole("USER")) {
                return "redirect:/main_user";
            }
            else
            {
                return "redirect:/index";
            }
        }
        @RequestMapping(value={"/"})
        public String viewHomePage(Model model) {
            return "index";
        }
        @RequestMapping(value={"/main_user"})
        public String showUserPage(Model model) {
            List<Zwierzeta> listZwierzeta = dao.list();
            model.addAttribute("listZwierzeta", listZwierzeta);
            return "user/main_user";
        }

        @RequestMapping("/main_admin")
        public String showAdminPage(Model model){
            List<Zwierzeta> listZwierzeta = dao.list();
            model.addAttribute("listZwierzeta", listZwierzeta);

            return "admin/main_admin";
        }

        @RequestMapping("/new")
        public String showNewForm(Model model) {
            Zwierzeta zwierzeta = new Zwierzeta();
            model.addAttribute("zwierzeta", zwierzeta);
            return "new_form";
        }

        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String save(@ModelAttribute("zwierzeta") Zwierzeta zwierzeta) {
            dao.save(zwierzeta);

            return "redirect:/";
        }

        @RequestMapping("/edit/{Nr_zwierzecia}")
        public ModelAndView showEditForm(@PathVariable(name = "Nr_zwierzecia") int Nr_zwierzecia) {
            ModelAndView mav = new ModelAndView("edit_form");
            Zwierzeta zwierzeta = dao.get(Nr_zwierzecia);
            mav.addObject("zwierzeta", zwierzeta);

            return mav;
        }

        @RequestMapping(value = "/update", method = RequestMethod.POST)
        public String update(@ModelAttribute("zwierzeta") Zwierzeta zwierzeta) {
            dao.update(zwierzeta);

            return "redirect:/";
        }

        @RequestMapping("/delete/{Nr_zwierzecia}")
        public String delete(@PathVariable(name = "Nr_zwierzecia") int Nr_zwierzecia) {
            dao.delete(Nr_zwierzecia);
            return "redirect:/";
        }
    }
}
