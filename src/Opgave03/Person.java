package Opgave03;

public class Person {
    private String navn;
    private String addresse;

    public Person(String navn, String addresse) {
        this.navn = navn;
        this.addresse = addresse;
    }

    public String getNavn() {
        return navn;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
