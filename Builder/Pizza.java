package BuilderArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-11.
 */
public class Pizza {
    String dough;
    String cheese;
    String meat;
    String mushrooms;
    String sauce;

    public String toString() {
        return  "pizza ingredients:\nDough - " + this.dough + ",\nSauce: " + this.sauce + ",\nCheese: " + this.cheese + ",\nMeat: " + this.meat+"," + "\n" + "Mushrooms: " + this.mushrooms;
    }
}
