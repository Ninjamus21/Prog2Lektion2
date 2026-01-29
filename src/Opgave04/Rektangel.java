package Opgave04;

public class Rektangel extends GeometriskeFigurer {

    private double sidelængde1;
    private double sidelængde2;

    public Rektangel(int xCord, int yCord, String navn, double sidelængde1, double sidelængde2) {
        super(xCord, yCord, navn);
        this.sidelængde1 = sidelængde1;
        this.sidelængde2 = sidelængde2;
    }

    @Override
    public double beregnAreal() {
        return sidelængde1 * sidelængde1;
    }
}
