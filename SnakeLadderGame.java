public class SnakeLadderGame { 
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	public static void main (String args[]) {
		System.out.println("Welcome to Snake Ladder Game");
		int startingPosition = 0;
		int currentPosition = 0;
		System.out.println("Game start at position: " + startingPosition);
		while (currentPosition <= 100) {
		int noDie = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Number on Die: " + noDie);
		int options = (int) Math.floor(Math.random() * 10) % 3;
		switch (options) {
			case IS_LADDER:
				currentPosition = currentPosition + noDie;
				break;
			case IS_SNAKE:
				currentPosition = currentPosition - noDie;
				if (currentPosition < 1) {
					currentPosition = 0;
				}
				break;
			default:
				currentPosition = currentPosition;
		}
		System.out.println("Current position: " + currentPosition);
		}

	}
}
