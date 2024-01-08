package bdbt_bada_project.SpringApplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ZwierzetaDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<bdbt_bada_project.SpringApplication.Zwierzeta> list(){
        String sql = "SELECT * FROM WIKTOR.\"ZWIERZETA\"";
        List<bdbt_bada_project.SpringApplication.Zwierzeta> listZwierzeta = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(bdbt_bada_project.SpringApplication.Zwierzeta.class));
        return listZwierzeta;
    }

    public ZwierzetaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(bdbt_bada_project.SpringApplication.Zwierzeta Zwierzeta) {
    }
    /* Read – odczytywanie danych z bazy */
    public bdbt_bada_project.SpringApplication.Zwierzeta get(int id) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(bdbt_bada_project.SpringApplication.Zwierzeta Zwierzeta) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int id) {
    }

}
