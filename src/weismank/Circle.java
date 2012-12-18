package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a Circle
 * @author weismank
 *
 */
public class Circle extends Shape {
	
	private static final double DEGREES = 360;
	private static final int SEGMENT_NUMBER = 25;
	
	private double radius;

	public Circle(double x_origin, double y_origin, double r, Color color) {
		super(x_origin, y_origin, color);
		this.radius = Math.abs(r);
	}

	/**
	 * Draws the Circle. Uses sine and cosine functions from the java.lang.Math class
	 * to compute a finite set of points that lie on the circumference of a circle,
	 * and then uses the drawTo method of WinPlotter to draw a sequence of small connected
	 * straight-line segments. When enough segments are drawn (about 25 segments are
	 * sufficient), a smooth circle is approximated.
	 */
	public void draw(WinPlotter plotter) {
		this.setPenColor(plotter);
		plotter.moveTo(x0+radius, y0);
		double deltaDegree = DEGREES / SEGMENT_NUMBER;
		for(int i = 1; i <= SEGMENT_NUMBER ; i++){
			double degree = deltaDegree*i;
			double radian = Math.toRadians(degree);
			double x = x0+radius*Math.cos(radian);
			double y = y0+radius*Math.sin(radian);
			plotter.drawTo(x, y);
		}
	}

}
