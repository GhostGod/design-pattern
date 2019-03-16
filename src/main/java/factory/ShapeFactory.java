package factory;

import abstractfactory.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if ("circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(shapeType)) {
			return new Square();
		} else {
			throw new RuntimeException("不支持的类型");
		}
	}

	@Override
	public String getString(String string) {
		return null;
	}
}
