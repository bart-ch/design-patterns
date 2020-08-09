package DekoratorArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class Royalburger extends Burger {

    public Royalburger() {
        opis = "Royalburger";
    }
    
    @Override
    public double obliczCene() {
        return 10.50;
    }
}
