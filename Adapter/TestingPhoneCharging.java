package AdapterArtykulVol2;

/**
 * Created by "Bartosz Chodyla" on 2020-08-09.
 */
public class TestingPhoneCharging {
    public static void main(String[] args) {

        MicroUsbCharger microUsbCharger = new MicroUsbCharger();

        LightningCharger lightningCharger = new LightningCharger();

        AppleCharger microUsbChargerAdapter = new MicroUsbChargerAdapter(microUsbCharger);

        System.out.println("The Android charger says:");
        microUsbCharger.chargeAndroidPhone();

        System.out.println("\nThe iPhone charger says:");
        testIphoneCharing(lightningCharger);

        System.out.println("\nThe microUsbChargerAdapter says:");
        testIphoneCharing(microUsbChargerAdapter);
    }

    static void testIphoneCharing(AppleCharger appleCharger) {
        appleCharger.chargeApplePhone();
    }
}
