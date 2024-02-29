package proxy.youtubeProxy;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http:www.youtube.com" + videoId);
        return getSomeVideo( videoId );
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http:www.youtube.com");
        return getRandomVideos();
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Conectando a " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Conetado!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Descargando populares... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "DCatzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.uou"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Bolivar vs The Strongest.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Listo!" + "\n");
        return hmap;
    }

    private Video getSomeVideo( String videoId ) {
        System.out.print("Descargando video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Titulo de ejemplo");

        System.out.print("Done!" + "\n");
        return video;
    }
    
}
