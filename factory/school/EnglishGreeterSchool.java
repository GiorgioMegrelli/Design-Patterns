package factory.school;

import factory.greeter.EnglishGreeter;
import factory.greeter.Greeter;

public class EnglishGreeterSchool implements GreeterSchool {
    @Override
    public Greeter teach() {
        return new EnglishGreeter();
    }
}
