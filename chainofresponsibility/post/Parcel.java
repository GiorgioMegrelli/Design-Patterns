package chainofresponsibility.post;

import java.util.Random;

public class Parcel {

    private static final Random random = new Random();

    private final long id;

    public Parcel() {
        this(random.nextLong());
    }

    public Parcel(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
