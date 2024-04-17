package com.example.oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


@Repository
public class bilettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(bilettLagring billett) {
        String sql = "INSERT INTO billett (filmer, antallBiletter, fornNavn, etterNavn, telefonNr, epost) VALUES(?, ?, ?, ?, ?, ?)";
        db.update(sql, billett.getFilmer(), billett.getAntallBiletter(), billett.getFornNavn(), billett.getEtterNavn(), billett.getTelefonNr(), billett.getEpost());
    }
    public List<bilettLagring> hentAlleBilletter() {
        String sql = "SELECT * FROM billett ORDER BY etterNavn DESC";
        return db.query(sql, new BeanPropertyRowMapper<>(bilettLagring.class));
    }

    public void slettAlleBilletter() {
        String sql = "DELETE FROM billett";
        db.update(sql);
    }

}
