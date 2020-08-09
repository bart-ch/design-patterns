package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-07-22.
 */
public abstract class Burger {
    String opis = "Burger nieznany";

    public String pobierzOpis() {
        return opis;
    }

    public abstract double obliczCene();
}
