package com.muhammet;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Runner_Atomic {

	public static void main(String[] args) {
		List<String> isimListesi = List.of("Ahmet","Canan","Duru","Bahar","Selim","Tuba");
		AtomicInteger  sayac = new AtomicInteger(1);
		isimListesi.forEach(x->{
			System.out.println(sayac+". kiþi..: "+x);
			sayac.getAndIncrement();
		});
		
	}
}
