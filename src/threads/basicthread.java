package threads;

class mythread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("mythread");
	}
	
}
public class basicthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1  = new Thread(new mythread());
		thread1.start();
	}

}
