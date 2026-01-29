package Opgave05;

public abstract class VareKrav extends Vare{

    public VareKrav(double pris, String navn, String beskrivelse) {
        super(pris, navn, beskrivelse);
    }

    public abstract double beregnPris();
}
