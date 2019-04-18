package game;

import java.util.ArrayList;

public class Square {

	float x, y, w = 100;

	public Square(float x, float y, float w) {
		this.x = x - w / 2;
		this.y = y - w / 2;
		this.w = w;
	}

	ArrayList<Square> makeSquares() {
		ArrayList<Square> sq = new ArrayList<Square>();
		sq.add(new Square(x + w, y, w / 2));// topright
		sq.add(new Square(x, y, w / 2));// topleft
		sq.add(new Square(x + w, y + w, w / 2));// bottomright
		sq.add(new Square(x, y + w, w / 2));// bottomleft
		return sq;
	}

}
