package observer.channel;

import observer.video.Video;
import observer.viewer.Viewer;

import java.util.HashSet;
import java.util.Set;

public class Channel {

    private final Set<Viewer> viewers = new HashSet<>();
    private Video lastVideo = null;

    public void upload(Video video) {
        lastVideo = video;
        if (lastVideo != null) {
            for (Viewer viewer : viewers) {
                if (!viewer.isKid() || lastVideo.isForKids()) {
                    viewer.notifyViewer(this);
                }
            }
        }
    }

    public void subscribeViewer(Viewer viewer) {
        if (viewer != null) {
            viewers.add(viewer);
        }
    }

    public void unsubscribeViewer(Viewer viewer) {
        if (viewer != null) {
            viewers.remove(viewer);
        }
    }

    public Video getLastVideo() {
        return lastVideo;
    }
}
