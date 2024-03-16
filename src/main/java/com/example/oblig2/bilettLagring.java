package com.example.oblig2;

public class bilettLagring {
    private String filmer;
    private String antallBiletter;
    private String fornNavn;
    private String etterNavn;
    private String telefonNr;
    private String epost;

    public bilettLagring(String film, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.filmer = film;
        this.antallBiletter = antall;
        this.fornNavn = fornavn;
        this.etterNavn = etternavn;
        this.telefonNr = telefonnr;
        this.epost = epost;
    }

    public String getFilm() {
        return filmer;
    }

    public void setFilm(String film) {
        this.filmer = film;
    }

    public String getAntall() {
        return antallBiletter;
    }

    public void setAntall(String antall) {
        this.antallBiletter = antall;
    }

    public String getFornavn() {
        return fornNavn;
    }

    public void setFornavn(String fornavn) {
        this.fornNavn = fornavn;
    }

    public String getEtternavn() {
        return etterNavn;
    }

    public void setEtternavn(String etternavn) {
        this.etterNavn = etternavn;
    }

    public String getTelefonnr() {
        return telefonNr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonNr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
