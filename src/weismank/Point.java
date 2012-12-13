package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

public class Point extends Shape {

	public Point(double x_origin, double y_origin, Color color) {
		super(x_origin, y_origin, color);
	}

	@Override
	public void draw(WinPlotter plotter) {
		plotter.drawPoint(x0, x0);
	}

}
