package factory.greeter;

public class FrenchGreeter implements Greeter {
    @Override
    public void say() {
        System.out.println("Bonjour!");
    }
}
