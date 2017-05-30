package threads;

class keywordsync {
	
	private static volatile int increment=0;
	protected boolean shutdown = false;
	
	private void increment(){
		synchronized(this){
			increment++;
		}
	}
	public void run(){
		
		Thread thread1 = new Thread(new Runnable(){
			
			public void run(){
				while(!shutdown){
					increment();
					System.out.println(increment);
					}
			}
		});
		Thread thread2 = new Thread(new Runnable(){
			
			
			public void run(){
				while(!shutdown){
				increment();
				System.out.println(increment);
				}
			}
		});
		
		
		thread1.start();
		thread2.start();
		
	}
}

public class SyncThread2 {
	
	public static void main(String... args){
		keywordsync ks = new keywordsync();
		ks.run();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ks.shutdown = true;
		
	}
}