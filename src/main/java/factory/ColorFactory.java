package factory;

import abstractfactory.AbstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public String getString(String string) {
		return new String();
	}

}
