package com.example;

public class Tile {
	private final int value;

	// коориднаты на экране в пикселях * 1000
	private int x;
	private int y;

	public Tile(int value, int row, int column) {
		this.value = value;
		this.x = Constants.COLUMN[column] * Constants.FLOAT;
		this.y = Constants.ROW[row] * Constants.FLOAT;
	}

	public int getValue() {
		return value;
	}

	public void setCol(int column) {
		this.x = Constants.COLUMN[column] * Constants.FLOAT;
	}

	public void setRow(int row) {
		this.y = Constants.ROW[row] * Constants.FLOAT;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj != null) &&
				this.value == ((Tile) obj).getValue() &&
				this.x == ((Tile) obj).getX() &&
				this.y == ((Tile) obj).getY();
	}
}
