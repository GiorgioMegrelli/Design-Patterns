package observer.viewer;

public class AdultViewer extends Viewer {

    private final String name;

    public AdultViewer(String name) {
        this.name = (name != null) ? name : DEFAULT_NAME;
    }

    @Override
    public boolean isKid() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
