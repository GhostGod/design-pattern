package multithread;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread {
	private Exchanger<String> exchanger;

	public ThreadB(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println(exchanger.exchange("bbbb"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
