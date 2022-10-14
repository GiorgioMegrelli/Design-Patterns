package prototype;

import prototype.cell.Cell;
import prototype.cell.Nucleotide;
import prototype.cell.PlantCell;

import java.util.Random;
import java.util.stream.IntStream;

public class Example {

    private static final Random random = new Random();
    private static final Nucleotide[] samples = {
            Nucleotide.ADENINE,
            Nucleotide.GUANINE,
            Nucleotide.THYMINE,
            Nucleotide.CYTOSINE,
    };

    private static Nucleotide[] randomSequence() {
        final int n = 20 + random.nextInt(20);
        return IntStream.range(0, n).mapToObj(i -> samples[random.nextInt(samples.length)]).toArray(Nucleotide[]::new);
    }

    public static void main(String[] args) {
        Cell<PlantCell> parent = new PlantCell(randomSequence());
        Cell<PlantCell> child = parent.duplicate();

        // Should be same
        System.out.printf("Parent cell: %s\n", parent);
        System.out.printf(" Child cell: %s\n", child);
        // Should be unique
        System.out.printf(" Other cell: %s\n", new PlantCell(randomSequence()));
    }

}
