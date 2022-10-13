package composite.legion;

public abstract class Military {

    private final int strength;
    private final double morale;

    public Military(int strength, double morale) {
        this.strength = strength;
        this.morale = morale;
    }

    public int getStrength() {
        return this.strength;
    }

    public double getMorale() {
        return this.morale;
    }

    @Override
    public String toString() {
        String fullClassName = this.getClass().getName();
        return String.format(
                "%s [Strength: %d, Morality: %.1f]",
                fullClassName.substring(fullClassName.lastIndexOf('.') + 1),
                this.getStrength(),
                this.getMorale()
        );
    }
}
