package fr.esiee.pic.esieedesigner.engine;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 * Program to draw grids.
 * 
 * @author Ian Darwin, http://www.darwinsys.com/
 */
class GridsCanvas extends Canvas {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1214184797311322792L;

int width, height;

  int rows;

  int cols;

  GridsCanvas(int r, int c) {
//    setSize(width = w, height = h);
    rows = r;
    cols = c;
  }

  public void paint(Graphics g) {
    int i;
    width = getSize().width;
    height = getSize().height;

    // draw the rows
    int rowHt = height / (rows);
    for (i = 0; i < rows; i++)
      g.drawLine(0, i * rowHt, width, i * rowHt);

    // draw the columns
    int rowWid = width / (cols);
    for (i = 0; i < cols; i++)
      g.drawLine(i * rowWid, 0, i * rowWid, height);
  }
}