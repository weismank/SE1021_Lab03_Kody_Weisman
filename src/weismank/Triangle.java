/*
 * SE1021 Lab 3
 * Triangle class
 * December 18, 2012 
 */
package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

public class Triangle extends Shape {
	
	protected double base;
	protected double height;
	
	/**
	 * Constructor -- creates the Triangle
	 * @param x_origin - cartesian x-origin of this Triangle
	 * @param y_origin - cartesian x-origin of this Triangle
	 * @param b - base (along x-axis) of this Triangle
	 * @param h - height (along y-axis) of this Triangle
	 * @param c - the java.awt.Color for this Triangle
	 */
	public Triangle(double x_origin, double y_origin, double b, double h, Color c)  {
		super(x_origin, y_origin, c);
		this.base = b;
		this.height = h;
	}

	/**
	 * Draws the Triangle. The origin of the triangle is the lower-left vertex. To draw a triangle, move to the origin, then draw a line (using WinPlotter's drawTo method) that represents the base, followed by the lines that represent the sides.
	 * @param plotter - reference to a WinPlotter object used for drawing
	 */
	public void draw(WinPlotter plotter) {
		this.setPenColor(plotter);
		plotter.moveTo(x0, y0);
		plotter.drawTo(x0+base, y0);
		plotter.drawTo(x0+base/2.0, y0+height);
		plotter.drawTo(x0, y0);
	}

}
