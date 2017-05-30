package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	
	private int id;
	
	public Processor(int id){
		this.id = id;
	}
	
	public void run(){
		System.out.println("starting " +id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ending " +id);
	}
}

public class PoolingofThreads {
	
	public static void main(String... args){
	ExecutorService executor = Executors.newFixedThreadPool(2);
	
	for(int i=0; i<5;i++){
		executor.submit(new Processor(i));
	}
	executor.shutdown();
	}
	
}
