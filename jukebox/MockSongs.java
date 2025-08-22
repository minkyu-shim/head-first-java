import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<Song> getSongs() {
        List<Song> songs = new ArrayList<Song>();
        songs.add(new Song("somersault","Zero 7",  95));
        songs.add(new Song("cassidy",   "Grateful Dead",120));
        songs.add(new Song("$10",       "Hitchhiker",   140));
        songs.add(new Song("havana",    "Camila",       105));
        songs.add(new Song("Cassidy",   "BNL",          118));
        songs.add(new Song("50 Ways",   "Paul Simon",   130));
        return songs;
    }
}
