package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Bekon extends SkładnikDekorator {

    Burger burger;

    public Bekon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String pobierzOpis() {
        return burger.pobierzOpis() + ", Bekon";
    }

    @Override
    public double obliczCene() {
        return burger.obliczCene() + 1.20;
    }
}
