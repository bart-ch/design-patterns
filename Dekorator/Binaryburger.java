package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Binaryburger extends Burger {

    public Binaryburger() {
        opis = "Binaryburger";
    }
    
    @Override
    public double obliczCene() {
        return 10.10;
    }
}
