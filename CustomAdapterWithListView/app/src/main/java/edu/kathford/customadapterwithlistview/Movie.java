package edu.kathford.customadapterwithlistview;

public class Movie {
    private int id;
    private String name;
    private String language;
    private String genre;
    private String duration;
//    private int imageUrl;

    public Movie(int id,
                 String name,
                 String language,
                 String genre, String duration) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.genre = genre;
        this.duration = duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
