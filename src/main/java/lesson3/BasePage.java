package lesson3;

public abstract class BasePage {

    protected abstract void navigateTo();

    protected void open() {
        System.out.println("Hello");
    }
}
