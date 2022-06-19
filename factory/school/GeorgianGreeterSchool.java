package factory.school;

import factory.greeter.GeorgianGreeter;
import factory.greeter.Greeter;

public class GeorgianGreeterSchool implements GreeterSchool {
    @Override
    public Greeter teach() {
        return new GeorgianGreeter();
    }
}
