package it.itispaleocapa.sonzognig;

public class Partecipante {
    Personale p;
    int oreLavoro;
    public Partecipante (Personale p, int oreLavoro){
        this.p = p;
        this.oreLavoro = oreLavoro;
    }

    public int calcolaStipendio(){
        return p.calcolaStipendio(oreLavoro);
    }
}