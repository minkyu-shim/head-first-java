public class SongTestDrive {
	public static void main(String[] args) {
		Song fein = new Song("fein", "cardi");
		
		fein.play(3);
		
		fein.setArtist("post malone");
		System.out.println(fein.getArtist());
	}
}