package observer;

import observer.channel.Channel;
import observer.video.Video;
import observer.viewer.AdultViewer;
import observer.viewer.KidViewer;
import observer.viewer.Viewer;

public class Example {

    public static void main(String[] args) {
        Channel channel = new Channel();
        Viewer[] viewers = {
                new KidViewer("Kid 1"),
                new KidViewer("Kid 2"),
                new KidViewer("Kid 3"),
                new AdultViewer("Adult 1"),
                new AdultViewer("Adult 2")
        };
        Video[] videos = {
                new Video("Animation 1", true),
                new Video("Thriller 1", false)
        };

        System.out.println("Subscriptions:");
        for (Viewer viewer : viewers) {
            channel.subscribeViewer(viewer);
        }
        for (Video video : videos) {
            channel.upload(video);
        }

        System.out.println("Unsubscriptions:");
        for (Viewer viewer : viewers) {
            channel.unsubscribeViewer(viewer);
        }
        channel.upload(new Video("Animation 2", true));
    }

}
