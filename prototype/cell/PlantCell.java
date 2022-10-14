package prototype.cell;

public class PlantCell extends Cell<PlantCell> {

    public PlantCell(Nucleotide[] genome) {
        super(genome);
    }

    @Override
    public PlantCell duplicate() {
        return new PlantCell(this.genome); // Over simplified
    }

}
