package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Cebula extends SkładnikDekorator {

    Burger burger;

    public Cebula(Burger burger) {

        this.burger = burger;
    }

    @Override
    public String pobierzOpis() {

        return burger.pobierzOpis() + ", Cebula";
    }

    @Override
    public double obliczCene() {

        return burger.obliczCene() + 0.50;
    }
}
