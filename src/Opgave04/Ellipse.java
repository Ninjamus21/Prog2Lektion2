package Opgave04;

public class Ellipse extends GeometriskeFigurer {
    private double radius1;
    private double radius2;

    public Ellipse(int xCord, int yCord, String navn, double radius1, double radius2) {
        super(xCord, yCord, navn);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * radius1 * radius2;
    }
}
