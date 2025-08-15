import java.util.Scanner;

public class SimpleBattleshipGame {
	public static void main(String[] args) {
		SimpleBattleship dot = new SimpleBattleship(new int[]{2, 3, 4});
		Scanner sc = new Scanner(System.in);
		String result = "miss";
		
		while (!result.equals("kill")) {
			System.out.print("take a guess: ");
			int userGuess = sc.nextInt();
			result = dot.checkYourself(userGuess);
		}
		sc.close();
	}
}