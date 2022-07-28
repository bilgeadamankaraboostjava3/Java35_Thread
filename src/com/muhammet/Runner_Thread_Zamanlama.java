package com.muhammet;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Runner_Thread_Zamanlama {
	private static long start;
	public static void main(String[] args) {
		start = System.currentTimeMillis();
		Runnable r1 = () -> {
			System.out.println("1. alýþacak iþ");
			System.out.println("Süre...: "+ (System.currentTimeMillis()-start));
			};
		Runnable r2 = () -> {
			System.out.println("2. alýþacak iþ");
			System.out.println("Süre...: "+ (System.currentTimeMillis()-start));
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture<?> sr1 = service.schedule(r1, 8, TimeUnit.SECONDS);
		ScheduledFuture<?> sr2 = service.schedule(r2, 2, TimeUnit.SECONDS);
		
	}

}
