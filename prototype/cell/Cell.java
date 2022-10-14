package prototype.cell;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Cell<T> implements Prototype<T> {

    private static final Map<Nucleotide, String> NUCLEOTIDE_SYMBOLS = new HashMap<Nucleotide, String>() {{
        put(Nucleotide.ADENINE, "A");
        put(Nucleotide.GUANINE, "G");
        put(Nucleotide.THYMINE, "T");
        put(Nucleotide.CYTOSINE, "C");
    }};

    protected final Nucleotide[] genome;

    public Cell(Nucleotide[] genome) {
        this.genome = Arrays.copyOf(genome, genome.length);
    }

    @Override
    public String toString() {
        return Arrays.stream(this.genome).map(n -> {
            if(NUCLEOTIDE_SYMBOLS.containsKey(n)) {
                return NUCLEOTIDE_SYMBOLS.get(n);
            }
            return "";
        }).collect(Collectors.joining(""));
    }

    @Override
    public abstract T duplicate();

}
