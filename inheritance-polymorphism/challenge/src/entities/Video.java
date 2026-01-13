package entities;

public class Video extends Lesson {

    private String url;
    private int seconds;

    public Video() {

    }

    public Video(String duration, int seconds, String url) {
        super(duration);
        this.seconds = seconds;
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int duration() {
        return seconds;
    }
}
