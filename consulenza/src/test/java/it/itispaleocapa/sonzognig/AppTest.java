package it.itispaleocapa.sonzognig;

import org.junit.jupiter.api.Test;

import it.itispaleocapa.sonzognig.Personale.AnnoNonValidoException;
import it.itispaleocapa.sonzognig.Tecnico.specializazzioneNonValidaException;
import it.itispaleocapa.sonzognig.Tecnico.statoNonValidoException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    Progetto p = new Progetto();

    @Test
    public void calcolaSpeseTotTest() throws AnnoNonValidoException, statoNonValidoException, specializazzioneNonValidaException{
        Tecnico pers1 = new Tecnico("Giulio", "Patera", "Ptr", 2005, "info_tele", "interno");
        Tecnico pers2 = new Tecnico("Giulia", "Sonzogni", "Szg", 2005, "info_tele", "esterno");
        Tecnico pers3 = new Tecnico("Filippo", "Ambrosini", "Amb", 2010, "elett_auto", "interno");
        Tecnico pers4 = new Tecnico("Luca", "Mazzini", "Mzz", 2005, "elett_auto", "esterno");
        Funzionario pers5 = new Funzionario("Sandro", "Tonali", "Ttn", 2005);
        Funzionario pers6 = new Funzionario("Franca", "Alessandrini", "Als", 2022);
        Dirigente pers7 = new Dirigente("Michele", "Leonardi", "Leo", 1989);
        p.aggiungiPartecipante(pers1, 5);
        p.aggiungiPartecipante(pers2, 5);
        p.aggiungiPartecipante(pers3, 2);
        p.aggiungiPartecipante(pers4, 1);
        p.aggiungiPartecipante(pers5, 3);
        p.aggiungiPartecipante(pers6, 4);
        p.aggiungiPartecipante(pers7, 1);
        assertEquals(1286, p.calcolaSpeseTot());
    }
}
