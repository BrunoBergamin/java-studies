package entities;

public abstract class Lesson {

    private String title;

    public Lesson() {

    }

    public Lesson(String duration) {
        this.title = duration;
    }

    public String getDuration() {
        return title;
    }

    public abstract int duration();

}
