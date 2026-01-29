package Opgave05;

public class ElArtikel extends VareKrav {
    private double EnergiForbrugPrTime;

    public ElArtikel(double pris, String navn, String beskrivelse, double energiForbrugPrTime) {
        super(pris, navn, beskrivelse);
        EnergiForbrugPrTime = energiForbrugPrTime;
    }

    @Override
    public double beregnPris() {
        if (super.getPris() > 3) {
            return super.getPris() * 1.30;
        } else {
            return super.getPris();
        }
    }
}
