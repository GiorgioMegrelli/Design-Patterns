package composite;

import composite.legion.Military;
import composite.legion.military.Centurion;
import composite.legion.military.Emperor;
import composite.legion.military.Legionary;
import composite.legion.structure.Centuria;
import composite.legion.structure.Legion;

import static composite.legion.RandomUtil.randomRange;

public class Example {

    public static Military createCenturia() {
        Centuria centuria = new Centuria();
        for (int i = 0; i < randomRange(50, 150); i++) {
            centuria.add(new Legionary());
        }
        for (int i = 0; i < randomRange(1, 2); i++) {
            centuria.add(new Centurion());
        }
        return centuria;
    }

    public static Military createLegion() {
        Legion legion = new Legion();
        for (int i = 0; i < randomRange(45, 55); i++) {
            legion.add(createCenturia());
        }
        legion.add(new Emperor());
        if(randomRange(1, 9) == 1) {
            legion.add(new Emperor());
        }
        return legion;
    }

    public static void printMilitary(Military military) {
        System.out.println(military);
    }

    public static void main(String[] args) {
        Military legionary = new Legionary();
        Military legion = createLegion();

        printMilitary(legion);
        printMilitary(legionary);
    }

}
