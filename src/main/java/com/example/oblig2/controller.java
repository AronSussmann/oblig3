package com.example.oblig2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class controller {
    public final List<bilettLagring> billettListe = new ArrayList<>();

    @PostMapping("/lagre")
    public void save(bilettLagring billett) {
        billettListe.add(billett);
    }
    @GetMapping("/hentBilletter")
    public List<bilettLagring> getBillettListe() {
        return billettListe;
    }

    @PostMapping ("/slett")
    public void slettArray(){
        billettListe.clear();
    }
}
