package Opgave05;

public class Spiritus extends VareKrav {
    private double alcoholProcent;

    public Spiritus(double pris, String navn, String beskrivelse, double alcoholProcent) {
        super(pris, navn, beskrivelse);
        this.alcoholProcent = alcoholProcent;
    }

    @Override
    public double beregnPris() {
        if (super.getPris() > 90) {
            return super.getPris() * 2.20;
        } else {
            return super.getPris() * 1.80;
        }
    }
}
