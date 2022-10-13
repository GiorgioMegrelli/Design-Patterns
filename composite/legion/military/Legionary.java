package composite.legion.military;

import composite.legion.Military;

import static composite.legion.RandomUtil.randomRange;

public class Legionary extends Military {

    public Legionary() {
        super(randomRange(4, 6), 1);
    }

}
