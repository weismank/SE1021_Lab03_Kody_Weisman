/*
 * SE1021 Lab 3
 * Rectangle class
 * December 18, 2012 
 */
package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a Rectangle
 * @author weismank
 *
 */
public class Rectangle extends Shape {
	
	protected double height;
	protected double width;

	/**
	 * Constructor -- creates the Rectangle
	 * @param x_origin
	 * @param y_origin
	 * @param w
	 * @param h
	 * @param c
	 */
	public Rectangle(double x_origin, double y_origin, double w, double h, Color c) {
		super(x_origin, y_origin, c);
		this.height = h;
		this.width = w;
	}

	/**
	 * Draws the Rectangle. The origin of the rectangle is the lower-left vertex.
	 * To draw a rectangle, move to the origin (using WinPlotter's moveTo method),
	 * then draw a line (using WinPlotter's drawTo method)that represents the base,
	 * followed by the lines that represent the sides and top.
	 * @param plotter - reference to a WinPlotter object used for drawing
	 */
	public void draw(WinPlotter plotter) {
		this.setPenColor(plotter);
		plotter.moveTo(x0, y0);
		plotter.drawTo(x0, y0+height);
		plotter.drawTo(x0+width, y0+height);
		plotter.drawTo(x0+width, y0);
		plotter.drawTo(x0, y0);
	}

}
