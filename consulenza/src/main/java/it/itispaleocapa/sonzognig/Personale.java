package it.itispaleocapa.sonzognig;

import java.time.LocalDate;

public abstract class Personale {
    
    public class AnnoNonValidoException extends Exception{}
    
    String nome, cognome, codice;
    int annoAssunzione;
    public Personale (String nome, String cognome, String codice, int annoAssunzione) throws AnnoNonValidoException{
        if(annoAssunzione < 1980  || annoAssunzione > LocalDate.now().getYear()){
            throw new AnnoNonValidoException();
        }
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.annoAssunzione = annoAssunzione;
    }

    public int calcolaStipendio(int oreLavoro) {
        return 100;
    }

    public int calcolaStipendio(int oreLavoro, int compenso) {
        return compenso;
    }
}
