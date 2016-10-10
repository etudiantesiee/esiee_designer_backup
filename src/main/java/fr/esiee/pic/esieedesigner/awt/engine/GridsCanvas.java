package fr.esiee.pic.esieedesigner.awt.engine;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;

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
	 * Taille des traits de jointures
	 */
	private static final float BIG_STROKE_WITH = 7.0f;

	/**
	 * Limit
	 */
	private static final float BIG_STROKE_MITER_JOIN_LIMIT = 1.0f;

	/**
	 * Pattern des traits de jointure
	 */
	private static final float[] BIG_STROKE_DASH_ARRAY = { 1.0f };

	/**
	 * Offset avant tracé des traits
	 */
	private static final float BIG_STROKE_DASH_PHASE = 0.0f;
	
	/**
	 * Couleur des grandes bordures
	 */
	private static final Color BIG_STROKE_COLOR = Color.BLACK;
	
	/**
	 * Couleur des grandes bordures
	 */
	private static final Color LINE_COLOR = Color.GRAY;

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
		
		g2d.setPaint(LINE_COLOR);
		
		for (i = 0; i < rows; i++) {
			Stroke currentStroke = g2d.getStroke();
			Paint currentPaint = g2d.getPaint();

			if (i == 2 || i == rows - 2) {
				g2d.setPaint(BIG_STROKE_COLOR);
				Stroke bigStroke = makeGridBigStroke();
				g2d.setStroke(bigStroke);
			}

			g2d.drawLine(0, i * rowHt, width, i * rowHt);
			g2d.setPaint(currentPaint);
			g2d.setStroke(currentStroke);
		}

		// draw the columns
		int rowWid = width / (cols);
		for (i = 0; i < cols; i++) {
			Stroke currentStroke = g2d.getStroke();
			Paint currentPaint = g2d.getPaint();

			if (i == 1 || i == cols - 1) {
				g2d.setPaint(Color.BLACK);
				Stroke bigStroke = makeGridBigStroke();
				g2d.setStroke(bigStroke);
			}

			g2d.drawLine(i * rowWid, 0, i * rowWid, height);
			g2d.setPaint(currentPaint);
			g2d.setStroke(currentStroke);
		}
	}

	/**
	 * Big stroke definition
	 * 
	 * @return
	 */
	private Stroke makeGridBigStroke() {
		// Définition de la forme des traits de jointure entre les points
		BasicStroke stroke = new BasicStroke(BIG_STROKE_WITH,
				BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER,
				BIG_STROKE_MITER_JOIN_LIMIT, BIG_STROKE_DASH_ARRAY,
				BIG_STROKE_DASH_PHASE);

		return stroke;
	}
}