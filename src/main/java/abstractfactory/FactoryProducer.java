package abstractfactory;

import factory.ColorFactory;
import factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String name) {
		if ("shape".equalsIgnoreCase(name)) {
			return new ShapeFactory();
		} else if ("color".equalsIgnoreCase(name)) {
			return new ColorFactory();
		}
		return null;
	}
}
