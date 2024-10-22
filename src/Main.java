public class Main {
    public static void main(String[] args) {

        Chargeable[] chargeableDevices = new Chargeable[3];
        chargeableDevices[0] = (new Laptop());
        chargeableDevices[1] = (new Tablet());
        chargeableDevices[2] = (new Phone());

        for (Chargeable device : chargeableDevices) {
            device.charge();
        }
    }
    }