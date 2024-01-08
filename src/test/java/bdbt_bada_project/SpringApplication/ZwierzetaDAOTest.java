package bdbt_bada_project.SpringApplication;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.print.attribute.standard.DateTimeAtCompleted;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZwierzetaDAOTest {
    private ZwierzetaDAO dao;
    @BeforeEach
    void setUp() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@192.168.1.11:1521:xe");
        datasource.setUsername("WIKTOR");
        datasource.setPassword("WIKTOR");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new ZwierzetaDAO(new JdbcTemplate(datasource));
    }
    @Test
    void list() {
        List<Zwierzeta> listZwierzeta = dao.list();
        assertFalse(listZwierzeta.isEmpty());
    }

    @Test
    void save() {
    }

    @Test
    void get() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}