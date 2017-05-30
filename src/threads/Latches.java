package threads;

import java.util.concurrent.CountDownLatch;

public class Latches {

	CountDownLatch latch = new CountDownLatch(3);
	
}

class processor implements Runnable {
	private CountDownLatch latch;
	public processor(CountDownLatch latch){
		this.latch = latch;
	}
	
	public void run(){
		System.out.println("started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
	}
	
}


