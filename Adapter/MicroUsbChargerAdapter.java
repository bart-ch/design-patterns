package AdapterArtykulVol2;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class MicroUsbChargerAdapter implements AppleCharger {
    MicroUsbCharger microUsbCharger;

    public MicroUsbChargerAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public void chargeApplePhone() {
        microUsbCharger.chargeAndroidPhone();
        System.out.println("Ykhm.. I mean, a Lightning charger.");
    }
}
