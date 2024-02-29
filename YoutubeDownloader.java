package proxy.youtubeProxy;

import java.util.HashMap;

public class YoutubeDownloader {
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (HTML god)");
        System.out.println("ID: " + video.id);
        System.out.println("Titulo: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Top videos mas populares (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Titulo: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
