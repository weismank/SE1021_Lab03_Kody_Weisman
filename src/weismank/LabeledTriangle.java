package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a LabeledTriangle
 * @author weismank
 *
 */
public class LabeledTriangle extends Triangle {

	private String name;
	
	/**
	 * Constructor -- creates the LabeledTriangle
	 * @param x_origin - cartesian x-origin of this LabeledTriangle
	 * @param y_origin - cartesian x-origin of this LabeledTriangle
	 * @param b - base (along x-axis) of this LabeledTriangle
	 * @param h - height (along y-axis) of this LabeledTriangle
	 * @param c - the java.awt.Color for this LabeledTriangle
	 * @param name - descriptive name for this LabeledTriangle
	 */
	public LabeledTriangle(double x_origin, double y_origin, double b, double h, Color c, String name)  {
		super(x_origin, y_origin, b, h, c);
		this.name = name;
	}
	
	/**
	 * Draws the LabeledTriangle, with the name printed near the base. To draw the sides and base of the LabeledTriangle, just call the Triangle's draw() method.
	 * @param plotter - reference to a WinPlotter object used for drawing
	 */
	public void draw(WinPlotter plotter){
		super.draw(plotter);
		plotter.printAt(x0+base/4.0, y0+height/4.0, name);
	}

}
