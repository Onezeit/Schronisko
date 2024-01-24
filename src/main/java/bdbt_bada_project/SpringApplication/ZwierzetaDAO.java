package bdbt_bada_project.SpringApplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ZwierzetaDAO {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public List<Zwierzeta> list(){
        String sql = "SELECT * FROM WIKTOR.\"ZWIERZETA\"";
        List<Zwierzeta> listZwierzeta = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Zwierzeta.class));
        return listZwierzeta;
    }

    public Zwierzeta get(int Nr_zwierzecia) {
        Object[] args = {Nr_zwierzecia};
        String sql = "SELECT * FROM WIKTOR.\"ZWIERZETA\" WHERE Nr_zwierzecia = " + args[0];
        Zwierzeta zwierzeta = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Zwierzeta.class));
        return zwierzeta;
    }

    public ZwierzetaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Zwierzeta zwierzeta) {
        SimpleJdbcInsert insertAction = new SimpleJdbcInsert(jdbcTemplate);
        insertAction.withTableName("Zwierzeta").usingColumns("Nr_zwierzecia", "Plec", "Waga", "Wzrost", "Dlugosc", "Kolor", "Chip", "Wiek", "Gatunek", "Rasa_zwierzecia", "Data_przyjecia", "Nr_schroniska", "Numer_adopcji");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(zwierzeta);
        insertAction.execute(param);
    }

    /* Update – aktualizacja danych */
    public void update(int Nr_zwierzecia, Zwierzeta zwierzeta) {
        String sql = "UPDATE WIKTOR.\"ZWIERZETA\" SET Plec=:Plec, Waga=:Waga, Wzrost=:Wzrost, Dlugosc=:Dlugosc, Kolor=:Kolor, Chip=:Chip, Wiek=:Wiek, Gatunek=:Gatunek, Rasa_zwierzecia=:Rasa_zwierzecia, Data_przyjecia=:Data_przyjecia, Nr_schroniska=:Nr_schroniska, Numer_adopcji=:Numer_adopcji WHERE Nr_zwierzecia=:Nr_zwierzecia";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(zwierzeta);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(sql, param);
    }

    /* Delete – wybrany rekord z danym id */
    public void delete(int Nr_zwierzecia) {
        String sql = "DELETE FROM WIKTOR.\"ZWIERZETA\" WHERE Nr_zwierzecia = ?";
        jdbcTemplate.update(sql, Nr_zwierzecia);
    }
}
