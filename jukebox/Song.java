public class Song implements Comparable<Song> {
    private final String title;
    private final String artist;
    private final int bpm;

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() { return this.title; }
    public String getArtist() { return this.artist; }
    public  int getBpm() { return this.bpm; }

    @Override
    public int compareTo(Song other) {
        // Natural order = title (case-insensitive), then artist, then bpm
        int c = String.CASE_INSENSITIVE_ORDER.compare(this.title, other.title);
        if (c != 0) return c;
        c = String.CASE_INSENSITIVE_ORDER.compare(this.artist, other.artist);
        if (c != 0) return c;
        return Integer.compare(this.bpm, other.bpm);
    }

    @Override
    public String toString() {
        return "%s - %s (%d bpm)".formatted(this.title, this.artist, this.bpm);
    }
}
