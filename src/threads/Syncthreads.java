package threads;

import java.util.Scanner;

class threading extends Thread {
	
	private volatile boolean running = true;
	public void run(){
		
		while(running){
			System.out.println(true);
			
			try{
				Thread.sleep(100);
			}catch(Exception e){
				
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
	
	
}
public class Syncthreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threading t1 = new threading();
		t1.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		t1.shutdown();
		
	}

}
