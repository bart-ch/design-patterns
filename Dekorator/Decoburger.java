package DekoratorArtykul;

import Dekorator.Espresso;
import Dekorator.Napoj;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Decoburger {

    public static void main(String[] args) {
        Burger burger1 = new Binaryburger();
        wypiszOpis(burger1);

        Burger burger2 = new Cheeseburger();
        burger2 = new Bekon(burger2);
        wypiszOpis(burger2);

        Burger burger3 = new Royalburger();
        burger3 = new Ser(burger3);
        burger3 = new Cebula(burger3);
        burger3 = new Bekon(burger3);
        wypiszOpis(burger3);
    }

    public static void wypiszOpis(Burger burger) {
        System.out.println(burger.pobierzOpis() + ", koszt: " + burger.obliczCene() + " zł");
    }
}
