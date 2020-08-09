package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Ser extends SkładnikDekorator {

    Burger burger;

    public Ser(Burger burger) {

        this.burger = burger;
    }

    @Override
    public String pobierzOpis() {

        return burger.pobierzOpis() + ", Ser";
    }

    @Override
    public double obliczCene() {

        return burger.obliczCene() + 0.90;
    }
}
