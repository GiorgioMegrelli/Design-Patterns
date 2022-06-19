package factory.greeter;

public class EnglishGreeter implements Greeter {
    @Override
    public void say() {
        System.out.println("Hello!");
    }
}
