package divergent_change.before;

import java.util.concurrent.FutureTask;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		if(width <= 0 || height <= 0) {
			throw new IllegalArgumentException("width and height must be greater than zero");
		}
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int area() {
		return width * height;
	}
	
	public int perimeter() {
		return 2 * (width + height);
	}
	
	public void print(String style) {
		style = style.toLowerCase();
		if(style.equals("full")) {
			FullRectanglePrinter printer = new FullRectanglePrinter(this);
			printer.print();
		} else if(style.equals("border")) {
			BorderRectanglePrinter printer = new BorderRectanglePrinter(this);
			printer.print();
		} else {
			System.out.println("style not recognized");
		}
	}
}