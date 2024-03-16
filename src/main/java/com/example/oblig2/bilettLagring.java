package com.example.oblig2;

public class bilettLagring {
    private String filmer;
    private String antallBiletter;
    private String fornNavn;
    private String etterNavn;
    private String telefonNr;
    private String epost;

    public bilettLagring(String filmer, String antallBiletter, String fornNavn, String etterNavn, String telefonNr, String epost) {
        this.filmer = filmer;
        this.antallBiletter = antallBiletter;
        this.fornNavn = fornNavn;
        this.etterNavn = etterNavn;
        this.telefonNr = telefonNr;
        this.epost = epost;
    }

    public String getFilmer() {
        return filmer;
    }

    public void setFilmer(String filmer) {
        this.filmer = filmer;
    }

    public String getAntallBiletter() {
        return antallBiletter;
    }

    public void setAntallBiletter(String antallBiletter) {
        this.antallBiletter = antallBiletter;
    }

    public String getFornNavn() {
        return fornNavn;
    }

    public void setFornNavn(String fornNavn) {
        this.fornNavn = fornNavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    public void setTelefonNr(String telefonNr) {
        this.telefonNr = telefonNr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
