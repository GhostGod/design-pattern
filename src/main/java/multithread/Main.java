package multithread;

import java.util.concurrent.Exchanger;

public class Main {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		ThreadB b = new ThreadB(exchanger);
		//ThreadC c = new ThreadC(exchanger);
		a.start();
		b.start();
		//c.start();
	}
}
