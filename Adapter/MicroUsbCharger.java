package AdapterArtykulVol2;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class MicroUsbCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("I'm a Micro USB Charger.");
    }
}
