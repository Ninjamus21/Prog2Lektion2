package Opgave03;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Ansat> ansats = new ArrayList<>();
        Mekaniker mekaniker1 = new Mekaniker("John Doe", "123 Main St", LocalDate.of(2002, 9, 2), 40000.0);
        Mekaniker mekaniker2 = new Mekaniker("Jane Smith", "456 Oak Ave", LocalDate.of(2005, 6, 15), 45000.0);
        Værkfører værkfører1 = new Værkfører("Mike Johnson", "789 Pine Rd", 60000.0, LocalDate.of(2010, 5, 20));
        Værkfører værkfører2 = new Værkfører("Emily Davis", "321 Maple Ln", 65000.0, LocalDate.of(2008, 8, 30));
        Mekaniker mekaniker3 = new Mekaniker("Chris Brown", "654 Cedar St", LocalDate.of(2010, 1, 5), 42000.0);
        Synsmand synsmand1 = new Synsmand("Anna Wilson", "987 Birch Blvd", LocalDate.of(2003, 4, 18), 48000.0, 5, 300);
        ArbejdsDreng arbejdsDreng1 = new ArbejdsDreng("Peter", "TingstedHave 10", 117);
        ArbejdsDreng arbejdsDreng2 = new ArbejdsDreng("Nicolai", "TingstedHave 10", 118);

        ansats.add(mekaniker1);
        ansats.add(mekaniker2);
        ansats.add(mekaniker3);
        ansats.add(værkfører1);
        ansats.add(værkfører2);
        ansats.add(synsmand1);
        ansats.add(arbejdsDreng1);
        ansats.add(arbejdsDreng2);

        double samletløn = samletløn(ansats);
        System.out.println((int) samletløn + "kr ");
    }

    public static double samletløn(ArrayList<Ansat> ansats) {
        double samletløn = 0;
        for (Ansat ansat : ansats) {
            double ugeLøn = ansat.beregnUgeLøn();
            System.out.println(ansat.getNavn() + " " + ugeLøn + "kr ");
            samletløn += ugeLøn;
        }
        return samletløn;
    }
}
