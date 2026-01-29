package Opgave03;

public abstract class Ansat extends Person{
    protected double løn;

    public Ansat(String navn, String addresse, double løn) {
        super(navn, addresse);
        this.løn = løn;
    }

    public double getLøn() {
        return løn;
    }
    public void setLøn(double løn) {
        this.løn = løn;
    }

    public abstract double beregnUgeLøn();
}
