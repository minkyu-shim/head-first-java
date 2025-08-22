import java.util.*;

public class JukeboxPro {
    static Comparator<Song> byArtist =
            Comparator.comparing(Song::getArtist, String.CASE_INSENSITIVE_ORDER);

    static Comparator<Song> byBpmDesc =
            Comparator.comparingInt(Song::getBpm).reversed();

    static Comparator<Song> byTitleThenArtist =
            Comparator.comparing(Song::getTitle, String.CASE_INSENSITIVE_ORDER)
                    .thenComparing(Song::getArtist, String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args) {
        List<Song> songs = new ArrayList<Song>(MockSongs.getSongs());
        System.out.println("Original: " + songs);
        Collections.sort(songs);
        System.out.println("Natural: " + songs);
        printSorted("By artist        ", songs, byArtist);
        printSorted("By BPM desc      ", songs, byBpmDesc);
        printSorted("Title then artist", songs, byTitleThenArtist);

        // use TitleCompare
        TitleCompare titlecompare = new TitleCompare();
        songs.sort(titlecompare);
        System.out.println(songs);
    }

    public static void printSorted(String label, List<Song> songs, Comparator<Song> cmp) {
        List<Song> copy = new ArrayList<>(songs);
        copy.sort(cmp);
        System.out.println(label + ": " + copy);
    }

    public static <T extends Comparable<? super T>> List<T> sortedCopy(List<T> input) {
        List<T> copy = new ArrayList<>(input);
        Collections.sort(copy);
        return copy;
    }

    static class TitleCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getTitle().compareTo(two.getTitle());
        }
    }
}
