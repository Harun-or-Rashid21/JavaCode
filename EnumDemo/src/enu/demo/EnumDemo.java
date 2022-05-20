package enu.demo;

enum Level {
	HIGH, MEDIUM, LOW;
}

public class EnumDemo {

	public static void main(String[] args) {

		Level lavel = Level.MEDIUM;

		if (lavel == Level.LOW) {
			System.out.println("It is Low level");
		} else if (lavel == Level.HIGH) {
			System.out.println("It is High level");
		} else if (lavel == Level.MEDIUM) {
			System.out.println("It is Medium level");
		} else {
			System.out.println("Nothing");
		}

		switch (lavel) {
		case LOW:
			System.out.println("It is LOW level");
			break;
		case HIGH:
			System.out.println("It is HIGH level");
			break;
		case MEDIUM:
			System.out.println("It is MEDIUM level");
			break;
		default:
			System.out.println("HAHAHAHA");
			break;
		}

	}

}
