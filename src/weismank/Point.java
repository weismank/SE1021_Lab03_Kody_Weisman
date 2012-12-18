package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a point
 * @author weismank
 *
 */
public class Point extends Shape {

	/**
	 * Constructor -- creates the Point
	 * @param x_origin - cartesian x-origin of this Point
	 * @param y_origin - cartesian x-origin of this Point
	 * @param color - the java.awt.Color for this Point
	 */
	public Point(double x_origin, double y_origin, Color color) {
		super(x_origin, y_origin, color);
	}

	@Override
	public void draw(WinPlotter plotter) {
		this.setPenColor(plotter);
		plotter.drawPoint(x0, y0);
	}

}
