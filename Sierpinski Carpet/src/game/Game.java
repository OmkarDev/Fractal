package game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import window.Window;

public class Game extends Window implements KeyListener {

	ArrayList<Square> squares = new ArrayList<Square>();
	static int size = 600;
	int w = size / 7;

	public Game(int width, int height, String title) {
		super(width, height, title);
		squares.add(new Square(0, 0, w));
	}

	public void draw() {
		background(Color.black);
		g.setColor(Color.white);
		g.translate(width / 2, height / 2 - 15);
		for (Square square : squares) {
			g.fillRect((int) square.x, (int) square.y, (int) square.w, (int) square.w);
		}
	}

	public static void main(String[] args) {
		Game game = new Game(Game.size, Game.size, "Sierpinski Carpet");
		game.fps = 30;
		game.canvas.addKeyListener(game);
		game.display();
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		ArrayList<Square> newSquares = new ArrayList<Square>();
		for (Square s : squares) {
			newSquares.add(s);
			newSquares.addAll(s.makeSquares());
		}
		squares = newSquares;
	}

	public void keyReleased(KeyEvent e) {
	}
}