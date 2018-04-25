package jpu2016.dogfight.modele;

public class Missile {
	static int SPEED = 4;
	static int WIDTH = 30;
	static int HEIGHT = 10;
	static int MAX_DISTANCE_TRAVELED = 1400;
	static String Image = "missile";
	int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
	}
	
	public static WidthWithADirection getWidthADirection(Direction direction) {
		return direction;
	}

	public static HeightWithADirection getWidthADirection(Direction direction) {
		return direction;
	}
	
	public void move() {	
	}

	public boolean isWeapon() {
	}
}
