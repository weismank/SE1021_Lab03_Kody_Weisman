package weismank;

import java.awt.Color;

import edu.msoe.se1010.winPlotter.WinPlotter;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double x_origin, double y_origin, double r, Color color) {
		super(x_origin, y_origin, color);
		this.radius = r;
	}

	@Override
	public void draw(WinPlotter plotter) {
		double startingX = x0 - radius;
		double endingX = x0 + radius;
		double circumfrence = 2 * radius;
		double interval = Math.pow(circumfrence, 2);
		double x = startingX;
		do{
			plotter.drawPoint(x, functionOfTopHalf(x));
			plotter.drawPoint(x, functionOfBottomHalf(x));
		}while(endingX < (x += interval));
	}
	
	private double functionOfTopHalf(double x){
			return x0 + Math.sqrt(Math.pow(radius, 2) - Math.pow(x - y0, 2));
	}
	
	private double functionOfBottomHalf(double x){
		return x0 - Math.sqrt(Math.pow(radius, 2) - Math.pow(x - y0, 2));
	}

}
