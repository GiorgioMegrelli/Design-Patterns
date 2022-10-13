package composite.legion.structure;

import composite.legion.Military;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

abstract class Structure extends Military {

    private final List<Military> militaries = new ArrayList<>();

    public Structure() {
        super(0, 0);
    }

    public Structure(List<Military> initMilitaries) {
        this();
        this.militaries.addAll(initMilitaries);
    }

    public void add(Military military) {
        militaries.add(military);
    }

    @Override
    public int getStrength() {
        double totalStrength = militaries.stream().mapToDouble(Military::getStrength).sum();
        return (int) (totalStrength * this.getMorale());
    }

    @Override
    public double getMorale() {
        return militaries.stream().mapToDouble(Military::getMorale).max().orElse(0);
    }

    @Override
    public String toString() {
        // Main purpose of this (long) method is Stream API review
        Function<Military, String> frequencyCollector
                = military -> military.getClass().getName();
        Function<Map.Entry<String, List<Military>>, String> toStringCollector = entry -> {
            String key = entry.getKey();
            return String.format("%s: %d", key.substring(key.lastIndexOf('.') + 1), entry.getValue().size());
        };

        Map<String, List<Military>> frequency = militaries.stream().collect(Collectors.groupingBy(frequencyCollector));
        return String.format(
                "%s%s",
                super.toString(),
                frequency.entrySet().stream().map(toStringCollector).collect(Collectors.toList())
        );
    }
}
