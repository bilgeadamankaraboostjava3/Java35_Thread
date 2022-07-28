package com.muhammet;

public class Runner_SleepOrnek {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println("Uygulama baþladý");
		Thread.sleep(3000);
		long end = System.currentTimeMillis();
		System.out.println("Uygulama Bitti...: "+ (end-start));
		

	}

}
