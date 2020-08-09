package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Cheeseburger extends Burger {

    public Cheeseburger() {
        opis = "Cheeseburger";
    }

    @Override
    public double obliczCene() {
        return 9.40;
    }
}
