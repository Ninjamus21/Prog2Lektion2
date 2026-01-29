package Opgave04;

public class Cirkel extends GeometriskeFigurer {
    private double radius;

    public Cirkel(int xCord, int yCord, String navn, double radius) {
        super(xCord, yCord, navn);
        this.radius = radius;
    }

    @Override
    public double beregnAreal(){
        return Math.PI * Math.pow(radius, 2);
    }
}
