package observer.viewer;

public class KidViewer extends Viewer {

    private final String name;

    public KidViewer(String name) {
        this.name = (name != null) ? name : DEFAULT_NAME;
    }

    @Override
    public boolean isKid() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
