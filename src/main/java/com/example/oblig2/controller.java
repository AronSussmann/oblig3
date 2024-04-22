package com.example.oblig2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class controller {

    @Autowired
    bilettRepository rep;

    @Autowired
    private JdbcTemplate db;



    @PostMapping("/lagre")
    public void save(bilettLagring billett) {
        rep.lagreBillett(billett);
    }
    @GetMapping("/hentBilletter")
    public List<bilettLagring> getBillettListe() {
        return rep.hentAlleBilletter();
    }

    @PostMapping ("/slettAlt")
    public void slettArray(){
        rep.slettAlleBilletter();
    }

    @PostMapping ("/slettBilett")
    public void slettBilett(Integer id){
        rep.slettBillett(id);
    }
    @GetMapping("/hentEnBillett")
    public  bilettLagring hentEnBillett(Integer id){
       return rep.hentEnBillett(id);
    }

    @PostMapping("/oppdaterBillett")
    public void oppdaterBillett(@RequestBody bilettLagring oppdatertBillett){
        rep.oppdaterBillett(oppdatertBillett);
    }

}
