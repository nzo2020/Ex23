public class Phone implements Chargeable {

    @Override
    public void charge() {
        System.out.println("The battery of the laptop is 100 percent");
    }

    public void call() {
        System.out.println("The phone is calling");
    }

    public void whatsApp() {
        System.out.println("The phone is opening WhatsApp");
    }
}
