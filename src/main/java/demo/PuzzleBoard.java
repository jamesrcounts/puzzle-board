package demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.teachingextensions.logo.PenColors;

public class PuzzleBoard extends JPanel {

	private static final long serialVersionUID = -3592444274530147326L;
	private List<Tile> tiles;

	public PuzzleBoard() {
		this.tiles = createTiles();
	}

	private static List<Tile> createTiles() {
		ArrayList<Tile> t = new ArrayList<Tile>(9);

		Tile tile = null;
		for (int i = 0; i < 9; i++) {
			if (i < 3) {
				tile = new Tile(i, 35, 35 + (127 * i));
			} else if (i < 6) {
				tile = new Tile(i, 162, 35 + (127 * (i - 3)));
			} else {
				tile = new Tile(i, 289, 35 + (127 * (i - 6)));
			}

			if (tile != null) {
				t.add(tile);
			}

			tile = null;
		}

		return t;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		drawBorder(g);
		drawField(g);
		drawTiles(g);
	}

	private void drawTiles(Graphics g) {
		Graphics2D g2d = (Graphics2D)g.create();
		for (Tile tile : tiles) {
			tile.paint(g2d);
		}
		g2d.dispose();
	}

	private void drawField(Graphics g) {
		g.setColor(PenColors.Blues.SkyBlue);
		g.fillRect(30, 30, 386, 386);
	}

	private void drawBorder(Graphics g) {
		g.setColor(PenColors.Blues.DarkBlue);
		g.fillRect(20, 20, 410, 410);
	}
}

// public List<Ball> getBalls() {
// return new ArrayList<Ball>(this.ballsUp);
// }
// }