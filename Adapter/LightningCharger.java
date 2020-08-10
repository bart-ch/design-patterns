package AdapterArtykulVol2;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class LightningCharger implements AppleCharger {
    @Override
    public void chargeApplePhone() {
        System.out.println("I'm a Lightning charger.");
    }
}
