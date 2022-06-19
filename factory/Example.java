package factory;

import factory.greeter.Greeter;
import factory.school.EnglishGreeterSchool;
import factory.school.FrenchGreeterSchool;
import factory.school.GeorgianGreeterSchool;
import factory.school.GreeterSchool;

public class Example {

    public static void main(String[] args) {
        GreeterSchool[] greeterSchools = {
                new EnglishGreeterSchool(),
                new FrenchGreeterSchool(),
                new GeorgianGreeterSchool()
        };
        for (GreeterSchool school : greeterSchools) {
            Greeter greeter = school.teach();
            greeter.say();
        }
    }

}
