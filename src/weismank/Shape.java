/*
 * SE1021 Lab 3
 * Shape abstract class
 * December 18, 2012 
 */
package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class represents a generic graphical shape.
 * @author weismank
 *
 */
public abstract class Shape {
	
	private Color color;
	protected double x0;
	protected double y0;
	
	/**
	 * Draws the Shape.
	 * @param plotter - reference to a WinPlotter object used for drawing
	 */
	public abstract void draw(WinPlotter plotter);
	
	/**
	 * Sets the color of the shape.
	 * @param color - the color to set
	 */
	public void setColor(Color color){
		this.color = color;
	}
	
	/**
	 * Set the pen color on the WinPlotter object to match the current color of the shape.
	 * @param plotter - reference to a WinPlotter whose pen color should be set
	 */
	public void setPenColor(WinPlotter plotter){
		plotter.setPenColor(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	/**
	 * Constructor initializes Shape attributes.
	 * @param x_origin - cartesian x-origin of this Shape
	 * @param y_origin - cartesian x-origin of this Shape
	 * @param color - the java.awt.Color for this Shape
	 */
	public Shape(double x_origin, double y_origin, Color color){
		this.x0 = x_origin;
		this.y0 = y_origin;
		this.color = color;
	}

}
