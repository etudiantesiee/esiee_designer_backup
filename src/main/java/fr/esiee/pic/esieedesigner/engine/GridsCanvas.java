package fr.esiee.pic.esieedesigner.engine;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 * Program to draw grids.
 * 
 * @author Ian Darwin, http://www.darwinsys.com/
 */
public class GridsCanvas extends Canvas {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1214184797311322792L;

	/**
	 * width
	 */
	private int width;

	/**
	 * height
	 */
	private int height;

	/**
	 * rows
	 */
	private int rows;

	/**
	 * cols
	 */
	private int cols;

	/**
	 * Default contructor
	 * 
	 * @param r
	 * @param c
	 */
	GridsCanvas(int r, int c) {
		rows = r;
		cols = c;
	}

	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		int i;
		width = getSize().width;
		height = getSize().height;

		// draw the rows
		int rowHt = height / (rows);
		for (i = 0; i < rows; i++) {
			g.drawLine(0, i * rowHt, width, i * rowHt);
		}

		// draw the columns
		int rowWid = width / (cols);
		for (i = 0; i < cols; i++) {
			g.drawLine(i * rowWid, 0, i * rowWid, height);
		}
	}
}