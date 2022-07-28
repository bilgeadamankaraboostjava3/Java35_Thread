package com.muhammet;

public class Runner_Sleep {
	private static long counter=0;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		final var mainThread = Thread.currentThread();
		new Thread(()->{
			for(int i=0;i<2_000_000_000L;i++) counter++;//10_000_000_000
			mainThread.interrupt();
		}).start();
		while(counter<2_000_000_000L) {
			System.out.println("Ko�ul hen�z sa�lanmad�");
			try {
				Thread.sleep(3_000);
			}catch (Exception e) {
				System.out.println("Hata...: "+ e.toString());
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("S�re.....: "
				+(end-start));
		System.out.println("Saya� de�eri....: "+ counter);

	}

}
