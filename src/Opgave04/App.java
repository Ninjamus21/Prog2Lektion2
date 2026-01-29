package Opgave04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<GeometriskeFigurer> geometriskeFigurers = new ArrayList<>();
        Cirkel cirkel1 = new Cirkel(3,2,"Cirkel", 2);
        Ellipse ellipse1 = new Ellipse(1,4,"Ellipse", 3,5);
        Kvadrat kvadrat1 = new Kvadrat(0,0,"Kvadrat", 4);
        Rektangel rektangel1 = new Rektangel(2,3,"Rektangel", 4,6);
        
        geometriskeFigurers.add(cirkel1);
        geometriskeFigurers.add(ellipse1);
        geometriskeFigurers.add(kvadrat1);
        geometriskeFigurers.add(rektangel1);

        for (GeometriskeFigurer geometriskeFigurer : geometriskeFigurers) {
            System.out.println(geometriskeFigurer.getNavn() + " Areal " + geometriskeFigurer.beregnAreal() + "\n");
        }
        
    }
}
