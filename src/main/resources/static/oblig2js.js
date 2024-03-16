// Oppretter Array for å lagre infoen fra brukeren og Regex for input validering
let kinoBilettArray = [];
let telefonNrRegex = /^(\+\d{1,3}[- ]?)?\d{8}$/;
let epostRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
let navnRegex = /^[a-zA-ZæøåÆØÅ' ]{2,30}$/;

// Lager en funksjon som skjer når brukeren clicker på kjøp billett
function kjopBilett() {
    // Først lagrer all informasjon som brukerenen skriver i input feltene
    const filmer = document.getElementById("filmer").value;
    const antallBiletter = document.getElementById("antallBiletter").value;
    const fornNavn = document.getElementById("fornNavn").value;
    const etterNavn = document.getElementById("etterNavn").value;
    const telefonNr = document.getElementById("telefonNr").value;
    const epost = document.getElementById("epost").value;

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

    // Om kravene er blitt oppfyllet blir inputen lagret som et objekt
    const kinoinfo = {
        filmer: filmer,
        antallBiletter: antallBiletter,
        fornNavn: fornNavn,
        etterNavn: etterNavn,
        telefonNr: telefonNr,
        epost: epost
    }
    // pusher objektet til arrayet
    kinoBilettArray.push(kinoinfo);

    let output = document.getElementById("output");
    output.innerHTML = ""; // Tømmer output-elementet før vi legger til ny informasjon

    // For loop og formatering for å printe ut arrayet
    for (let i = 0; i < kinoBilettArray.length; i++) {
        output.innerHTML += "<p><strong>Billett " + (i + 1) + ":</strong><br>" +
            "Film: " + kinoBilettArray[i].filmer +
            " Antall: " + kinoBilettArray[i].antallBiletter  +
            " Navn: " + kinoBilettArray[i].fornNavn +
            " " + kinoBilettArray[i].etterNavn +
            " Telefonnr: " + kinoBilettArray[i].telefonNr +
            " Epost: " + kinoBilettArray[i].epost + "</p>";
    }
    // Blanker alle input boksene slik at brukeren kan skjønne at infoen er blitt sendt
    document.getElementById("antallBiletter").value = "";
    document.getElementById("fornNavn").value = "";
    document.getElementById("etterNavn").value = "";
    document.getElementById("telefonNr").value = "";
    document.getElementById("epost").value = "";
}

// Funksjon for å slette arrayet og tømmet html outputten.
function slettArray() {
    kinoBilettArray = [];
    let output = document.getElementById("output");
    output.innerHTML = ""; // Tømmer output-elementet etter at vi har tømt arrayet
}