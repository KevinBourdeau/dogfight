package jpu2016.dogfight.modele;

public class Position {
	protected double x;
	protected double y;
	protected double maxX;
	protected double maxY;
	
	public Position (double x, double y, double maxX, double maxY) {
	}

	public Position (Position Position) {
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}

	
	
}
