package Opgave04;

public class Kvadrat extends GeometriskeFigurer {
    private double sideLængde;

    public Kvadrat(int xCord, int yCord, String navn, double sideLængde) {
        super(xCord, yCord, navn);
        this.sideLængde = sideLængde;
    }

    @Override
    public double beregnAreal() {
        return Math.pow(sideLængde, 2);
    }
}
