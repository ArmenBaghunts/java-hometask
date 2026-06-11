import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Song s1 = new Song(
                "Metallica",
                "Nothing Else Matters",
                LocalDate.of(1991, 8, 12));

        Song s2 = new Song(
                "Scorpions",
                "Wind of Change",
                LocalDate.of(1990, 1, 1));

        Song s3 = new Song(
                "Metallica",
                "Nothing Else Matters",
                LocalDate.of(1991, 8, 12));

        Playlist playlist =
                new Playlist(new ArrayList<>());

        playlist.addSong(s1);
        playlist.addSong(s2);

        playlist.play(s1);

        System.out.println(
                playlist.getCurrentSong());

        playlist.pause();

        ArrayList<Song> found =
                playlist.findByTitle(
                        "Nothing Else Matters");

        System.out.println(found);

        LinkedList<Song> otherSongs =
                new LinkedList<>();

        otherSongs.add(s3);

        playlist.addSongs(otherSongs);
    }
}