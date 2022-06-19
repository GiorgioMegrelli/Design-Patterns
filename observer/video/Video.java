package observer.video;

public class Video {

    public static final String DEFAULT_NAME = "Just Video";

    private final String name;
    private final boolean forKids;

    public Video(String name, boolean forKids) {
        this.name = (name != null) ? name : DEFAULT_NAME;
        this.forKids = forKids;
    }

    public String getName() {
        return name;
    }

    public boolean isForKids() {
        return forKids;
    }
}
