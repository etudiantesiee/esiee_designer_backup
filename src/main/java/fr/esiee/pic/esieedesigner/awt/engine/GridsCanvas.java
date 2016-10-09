package fr.esiee.pic.esieedesigner.awt.engine;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Program to draw grids.
 * 
 * @author Ian Darwin, http://www.darwinsys.com/
 */
public class GridsCanvas extends Component {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1214184797311322792L;

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
	public GridsCanvas(int r, int c) {
		rows = r;
		cols = c;
	}

	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		int i;
		int width = getSize().width;
		int height = getSize().height;

		// draw the rows
		int rowHt = height / (rows);
		for (i = 0; i < rows; i++) {
			g2d.drawLine(0, i * rowHt, width, i * rowHt);
		}

		// draw the columns
		int rowWid = width / (cols);
		for (i = 0; i < cols; i++) {
			g2d.drawLine(i * rowWid, 0, i * rowWid, height);
		}
	}
}