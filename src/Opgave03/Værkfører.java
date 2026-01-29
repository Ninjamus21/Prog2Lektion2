package Opgave03;

import java.time.LocalDate;

public final class Værkfører extends Ansat {
    private LocalDate værkførerUdnævnelseDato;

    public Værkfører(String navn, String addresse, double løn, LocalDate værkførerUdnævnelseDato) {
        super(navn, addresse, løn);
        this.værkførerUdnævnelseDato = værkførerUdnævnelseDato;
    }

    public LocalDate getVærkførerUdnævnelseDato() {
        return værkførerUdnævnelseDato;
    }

    public void setVærkførerUdnævnelseDato(LocalDate værkførerUdnævnelseDato) {
        this.værkførerUdnævnelseDato = værkførerUdnævnelseDato;
    }

    @Override
    public double beregnUgeLøn(){
        return løn / 4; // månedsbetalt
    }
}
