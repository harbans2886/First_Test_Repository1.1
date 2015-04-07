package com.mandy.designpatt;

public class SingleTonUsingClassTest {

	public static void main(String s[]) {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("t1 called ");
				SingleTonUsingClass single =  SingleTonUsingClass.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("t2 called ");
				SingleTonUsingClass single =  SingleTonUsingClass.getInstance();

			}
		});

		t1.start();
		t2.start();
	}
}
