package factory.school;

import factory.greeter.FrenchGreeter;
import factory.greeter.Greeter;

public class FrenchGreeterSchool implements GreeterSchool {
    @Override
    public Greeter teach() {
        return new FrenchGreeter();
    }
}
