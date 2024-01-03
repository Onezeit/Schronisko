package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ZwierzetaDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ZwierzetaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Zwierzeta> list(){
        String sql = "SELECT * FROM \"WIKTOR\".\"Zwierzeta\"";
        List<Zwierzeta> listZwierzeta = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Zwierzeta.class));

        return listZwierzeta;
    }
    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Zwierzeta Zwierzeta) {
    }
    /* Read – odczytywanie danych z bazy */
    public Zwierzeta get(int nrZwierzecia) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Zwierzeta Zwierzeta) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nrZwierzecia) {
    }


}
