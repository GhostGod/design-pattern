package multithread;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {
	private Exchanger<String> exchanger;

	public ThreadA(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println(exchanger.exchange("aaaa"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
