package de.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolDemo {

	public static void main(String[] args) throws Exception{
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for(int i = 0; i < 100; i++) {
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					// Berechne Sinn des Lebens
					
				}
			});
		}
		
		service.shutdown();
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		
	}

}
