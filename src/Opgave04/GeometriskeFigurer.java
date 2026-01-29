package Opgave04;

public abstract class GeometriskeFigurer {
    protected int xCord;
    protected int yCord;
    private String navn;

    public GeometriskeFigurer(int xCord, int yCord, String navn) {
        this.xCord = xCord;
        this.yCord = yCord;
        this.navn = navn;
    }

    public int getxCord() {
        return xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public String getNavn() {
        return navn;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public abstract double beregnAreal();
}
