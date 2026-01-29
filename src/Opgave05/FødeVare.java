package Opgave05;

public class FødeVare extends VareKrav{
    private int holdBarhedDage;

    public FødeVare(double pris, String navn, String beskrivelse, int holdBarhedDage) {
        super(pris, navn, beskrivelse);
        this.holdBarhedDage = holdBarhedDage;
    }

    @Override
    public double beregnPris() {
        // 5% moms
        return getPris() * 1.05;
    }
}
