import java.time.LocalDate;
import java.util.Objects;

public class Song {

    private String artist;
    private String title;
    private LocalDate releaseDate;

    public Song(String artist, String title, LocalDate releaseDate) {
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;

        return Objects.equals(artist, song.artist)
                && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}