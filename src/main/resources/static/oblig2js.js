
function testInfo() {
    let telefonNrRegex = /^(\+\d{1,3}[- ]?)?\d{8}$/;
    let epostRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    let navnRegex = /^[a-zA-ZæøåÆØÅ' ]{2,30}$/;

    let fornNavn = document.getElementById("fornNavn").value;
    let etterNavn = document.getElementById("etterNavn").value;
    let telefonNr = document.getElementById("telefonNr").value;
    let epost = document.getElementById("epost").value;
    let antallBiletter = document.getElementById("antallBiletter").value;

    // Validerer om det er skrevet tekst i input boksene
    if (fornNavn === "" || etterNavn === "" || telefonNr === "" || epost === "" || antallBiletter === "") {
        alert("Alle felt må fylles ut");
        return false; // Stopp funksjonen her
    }

    // Bruker regex og if setninger for å sjekke om de oppfyller kravene
    if (!telefonNrRegex.test(telefonNr)) {
        alert("Vennligst skriv inn et gyldig telefonnummer");
        return false;
    }

    if (!epostRegex.test(epost)) {
        alert("Vennligst skriv inn en gyldig e-postadresse");
        return false;
    }
    if (!navnRegex.test(fornNavn + etterNavn)) {
        alert("Skriv inn et gyldig navn")
        return false;
    }

    lagreInfo()

}

function lagreInfo(){
    const billett = {
        filmer: $("#filmer").val(),
        antallBiletter: $("#antallBiletter").val(),
        fornNavn: $("#fornNavn").val(),
        etterNavn: $("#etterNavn").val(),
        telefonNr: $("#telefonNr").val(),
        epost: $("#epost").val()
    };
    $.post("/lagre", billett, function(){
        hentBilletter();
    });

    // Tøm input-feltene
    $("#filmer").val("");
    $("#antallBiletter").val("");
    $("#fornNavn").val("");
    $("#etterNavn").val("");
    $("#telefonNr").val("");
    $("#epost").val("");
}

function hentBilletter(){
    $.get("/hentBilletter", function(visBilletter){
        formaterBilletter(visBilletter);
    });
}
function formaterBilletter(visBilletter){
    let ut = "";
    for (let billett of visBilletter){
        ut += "Film: " + billett.filmer + " Antall: " + billett.antallBiletter + " Navn: " + billett.fornNavn + " " + billett.etterNavn + " Telefon: " + billett.telefonNr + " Epost: " + billett.epost + "<br>";
    }
    document.getElementById("output").innerHTML = ut;
}


function slettArray(){
    $.post("/slett", function(){
        hentBilletter();
    });
}
