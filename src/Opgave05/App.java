package Opgave05;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Vare> vareList = new ArrayList<>();

    public static void main(String[] args) {

        ElArtikel vare1 = new ElArtikel(500, "AirFryer", "Lilleoven", 240);
        Spiritus vare2 = new Spiritus(100, "Whiskey", "Skotsk whiskey", 40);
        Vare vare3 = new Vare(200, "Bog", "En spændende roman");
        FødeVare vare4 = new FødeVare(50, "Brød", "Friskbagt brød", 5);
        Vare vare5 = new Vare(150, "Krus", "Kaffekrus");
        Spiritus vare6 = new Spiritus(80, "vin", "Rødvin", 17);

        vareList.add(vare1);
        vareList.add(vare2);
        vareList.add(vare3);
        vareList.add(vare4);
        vareList.add(vare5);
        vareList.add(vare6);

        kvitteringforIndkøb(vareList);
    }

    private static double prisForIndkøb() {
        double totalPris = 0;
        for (Vare vare : vareList) {
            totalPris += vare.getPris();
        }
        return totalPris;
    }

    private static void kvitteringforIndkøb(List<Vare> vareList) {
        for (Vare vare : vareList) {
            System.out.println(vare.getNavn() + " " + vare.beregnPris() + " moms: " + (vare.beregnPris() - vare.pris));
        }
        System.out.println("samlet pris: " + prisForIndkøb());
    }
}
