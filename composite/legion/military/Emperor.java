package composite.legion.military;

import composite.legion.Military;

import static composite.legion.RandomUtil.randomRange;

public class Emperor extends Military {

    public Emperor() {
        super(10, randomRange(20, 25) / 10.0);
    }

}
