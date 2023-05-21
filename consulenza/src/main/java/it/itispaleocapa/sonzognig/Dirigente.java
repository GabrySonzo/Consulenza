package it.itispaleocapa.sonzognig;

public class Dirigente extends Personale{

    public Dirigente(String nome, String cognome, String codice, int annoAssunzione) throws AnnoNonValidoException {
        super(nome, cognome, codice, annoAssunzione);
    }
    
}