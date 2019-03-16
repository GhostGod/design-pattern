package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Shape shape = new ShapeFactory().getShape("circle");
		shape.draw();
	}
}
