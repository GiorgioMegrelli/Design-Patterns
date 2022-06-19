package observer.viewer;

import observer.channel.Channel;

public abstract class Viewer {

    public static final String DEFAULT_NAME = "Just Viewer";

    public abstract boolean isKid();

    public abstract String getName();

    public void notifyViewer(Channel channel) {
        if (channel != null) {
            String videoName = channel.getLastVideo().getName();
            System.out.printf("%s watched '%s'\n", getName(), videoName);
        }
    }
}
