public class ProxyVideo implements Video {
    private RealVideo realVideo;
    private String fileName;
    private int viewCount = 0;

    public ProxyVideo(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        viewCount++;

        System.out.println(
            "--> [AUDIT] Video has been played "
            + viewCount + " time(s)."
        );

        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }

        realVideo.play();
    }
}
