public class Tablet implements Chargeable {

    @Override
    public void charge() {
        System.out.println("The battery of the laptop is 60 percent");
    }

    public void hasAPen() {
        System.out.println("The tablet has a pen");
    }

    public void flightMood() {
        System.out.println("The flight mood is on");
    }
}