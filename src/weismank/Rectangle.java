package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

public class Rectangle extends Shape {
	
	private double height;
	private double width;

	public Rectangle(double x_origin, double y_origin, double w, double h, Color c) {
		super(x_origin, y_origin, c);
		this.height = h;
		this.width = w;
	}

	@Override
	public void draw(WinPlotter plotter) {
		plotter.drawPoint(x0, y0);
		plotter.drawTo(x0, y0+height);
		plotter.drawTo(x0+width, y0+height);
		plotter.drawTo(x0+width, y0);
	}

}
