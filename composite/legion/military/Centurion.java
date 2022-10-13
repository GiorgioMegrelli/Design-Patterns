package composite.legion.military;

import composite.legion.Military;

import static composite.legion.RandomUtil.randomRange;

public class Centurion extends Military {

    public Centurion() {
        super(randomRange(7, 9), randomRange(11, 14) / 10.0);
    }

}
