package Opgave03;

public final class ArbejdsDreng extends Ansat{

    public ArbejdsDreng(String navn, String addresse, double løn) {
        super(navn, addresse, løn);
    }
    @Override
    public double beregnUgeLøn(){
        return løn * 24; // timebetalt
    }
}
