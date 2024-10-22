public class Laptop implements Chargeable {

    @Override
    public void charge() {
        System.out.println("The battery of the laptop is 80 percent");
    }

    public void sizeOfScreen() {
        System.out.println("The size of the screen is 13 inches");
    }

    public void openGoogle() {
        System.out.println("The laptop is opening Google");
    }
}