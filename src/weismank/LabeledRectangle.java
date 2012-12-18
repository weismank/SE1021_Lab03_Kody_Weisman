package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a LabeledRectangle
 * @author weismank
 *
 */
public class LabeledRectangle extends Rectangle {
	
	private String name;
	
	/**
	 * Constructor -- creates the LabeledRectangle
	 * @param x_origin - cartesian x-origin of this LabeledRectangle
	 * @param y_origin - cartesian x-origin of this LabeledRectangle
	 * @param w base - (along x-axis) of this LabeledRectangle
	 * @param h height - (along y-axis) of this LabeledRectangle
	 * @param c - the java.awt.Color for this LabeledRectangle
	 * @param name - descriptive name for this LabeledRectangle
	 */
	public LabeledRectangle(double x_origin, double y_origin, double w, double h, Color c, String name){
		super(x_origin, y_origin, w, h, c);
		this.name = name;
	}
	
	/**
	 * Draws the LabeledRectangle with the name in the center To draw the sides of the LabeledRectangle, just call the Rectangle's draw() method.
	 * @param plotter - reference to a WinPlotter object used for drawing
	 */
	public void draw(WinPlotter plotter){
		super.draw(plotter);
		plotter.printAt(x0+width/2.0, y0+height/2.0, name);
	}

}
