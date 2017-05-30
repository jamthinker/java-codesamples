package threads;

public class SyncThread1 {

	private int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SyncThread1 st1 = new SyncThread1();
		st1.dowork();
	}
	
	public void dowork(){
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i<10000;i++)
					count++;
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0; i<10000;i++)
					count++;
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}

}
