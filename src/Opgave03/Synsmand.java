package Opgave03;

import java.time.LocalDate;

public final class Synsmand extends Mekaniker{
    private int antalSynUge;
    private int tilskudPrSyn;

    public Synsmand(String navn, String addresse, LocalDate yearOfGraduation, Double løn, int antalSynUge, int tilskudPrSyn) {
        super(navn, addresse, yearOfGraduation, løn);
        this.antalSynUge = antalSynUge;
        this.tilskudPrSyn = tilskudPrSyn;
    }

    public int getAntalSynUge() {
        return antalSynUge;
    }

    public int getTilskudPrSyn() {
        return tilskudPrSyn;
    }

    public void setAntalSynUge(int antalSynUge) {
        this.antalSynUge = antalSynUge;
    }

    public void setTilskudPrSyn(int tilskudPrSyn) {
        this.tilskudPrSyn = tilskudPrSyn;
    }

    @Override
    public double beregnUgeLøn(){
        return løn / 4;
    }
}
