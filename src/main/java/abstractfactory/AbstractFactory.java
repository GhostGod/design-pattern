package abstractfactory;

import factory.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);

	public abstract String getString(String string);
}
