package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

public abstract class Shape {
	
	private Color color;
	protected double x0;
	protected double y0;
	
	public abstract void draw(WinPlotter plotter);
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public void setPenColor(WinPlotter plotter){
		plotter.setPenColor(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	public Shape(double x_origin, double y_origin, Color color){
		this.x0 = x_origin;
		this.y0 = y_origin;
		this.color = color;
	}

}
