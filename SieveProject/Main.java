package pr.main;

public class Main {
	public static void main(String[] args) {
		String input = Prime.getInput("Amount:");
		Prime.sieveEratos((Integer.parseInt(input)));
	}
}
