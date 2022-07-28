package com.muhammet;

public class Runner {

	public static void main(String[] args) {

		Deger d = new Deger();
		d.sayi = 20;
		MyThread mt = new MyThread(d);		
		MyRunnable mr = new MyRunnable(d);
		Thread t = new Thread(mr);
		mt.run();		
		t.start();
		new Thread(()-> {
			for(int i=0;i<10;i++)
				System.out.println("Lambda Thread kullanýmý");
		}).start();
	}

}

class Deger{
	int sayi;
}

class MyThread extends Thread{
	Deger d;
	public MyThread(Deger d) {
		this.d=d;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			d.sayi++;
			System.out.println("Thread....: "+ d.sayi);
		}
	}
}

class MyRunnable implements Runnable{
	Deger d;
	public MyRunnable(Deger d) {
		this.d=d;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			d.sayi--;
			System.out.println("Runnable....: "+ d.sayi);
		}		
	}
	
}









