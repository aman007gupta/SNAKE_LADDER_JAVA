public class SnakeLadderGame { 
	public static void main (String args[]) {
		System.out.println("Welcome to Snake Ladder Game");
		int startingPosition = 0;
		System.out.println("Game start at position: " + startingPosition);
		int noDie = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Number on Die: " + noDie);
	}
}
