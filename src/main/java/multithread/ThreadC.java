package multithread;

import java.util.concurrent.Exchanger;

public class ThreadC extends Thread {
	private Exchanger<String> exchanger;

	public ThreadC(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println(exchanger.exchange("cccc"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
