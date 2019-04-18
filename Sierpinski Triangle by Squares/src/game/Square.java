package game;

import java.util.ArrayList;

public class Square {

	float x, y, w;

	public Square(float x, float y, float w) {
		this.x = x - w / 2;
		this.y = y - w / 2;
		this.w = w;
	}

	ArrayList<Square> makeSquares() {
		//this is made by 3 fractals you should look wiki page of Sierpinski Triangle
		ArrayList<Square> sq = new ArrayList<Square>();
		sq.add(new Square( x+w-w/4, y+w/2, w / 2));//right
		sq.add(new Square( x+w/4, y+w/2, w / 2));//left
		sq.add(new Square( x+w/2, y, w / 2));//up
		return sq;
	}

}
