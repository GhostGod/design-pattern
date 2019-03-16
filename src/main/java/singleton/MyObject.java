package singleton;

public class MyObject {
	private static final MyObject obj = new MyObject();

	private MyObject() {

	}

	public static final Object getObject() {
		return obj;
	}
}
