package com.example.oblig2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class controller {

    @Autowired
    bilettRepository rep;



    @PostMapping("/lagre")
    public void save(bilettLagring billett) {
     rep.lagreBillett(billett);
    }
    @GetMapping("/hentBilletter")
    public List<bilettLagring> getBillettListe() {
        return rep.hentAlleBilletter();
    }

    @PostMapping ("/slett")
    public void slettArray(){
        rep.slettAlleBilletter();
    }
}
