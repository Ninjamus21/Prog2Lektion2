package Opgave03;

import java.time.LocalDate;

public class Mekaniker extends Ansat {
    private LocalDate yearOfGraduation;

    public Mekaniker(String navn, String addresse,LocalDate yearOfGraduation, Double løn) {
        super(navn, addresse, løn);
        this.yearOfGraduation = yearOfGraduation;
    }

    public LocalDate getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(LocalDate yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }


    @Override
    public double beregnUgeLøn(){
        return løn / 4;
    }
}
