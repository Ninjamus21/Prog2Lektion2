package Opgave05;

public class Vare {
    protected double pris;
    private String navn;
    private String Beskrivelse;

    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        Beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return Beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        Beskrivelse = beskrivelse;
    }

    public double beregnPris(){
        return pris * 1.25;
    }
}
