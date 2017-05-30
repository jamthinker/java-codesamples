package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class doSomething implements Callable<Integer> {
	int waittime;
	
	public doSomething(){
		
	}
	public doSomething(int timetowait){
		this.waittime = timetowait;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		
		TimeUnit.SECONDS.sleep(1);
		return 2;
	}		
}
public class ExcutrService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService eservice = Executors.newFixedThreadPool(3);
		doSomething ds = new doSomething();
		Future<Integer> future = eservice.submit(ds);
		try{
			System.out.println(future.get());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		eservice.shutdown();
	}

}
