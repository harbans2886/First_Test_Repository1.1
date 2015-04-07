package com.mandy.designpatt;

public class SingleTonUsingClass implements Cloneable {

	volatile private static SingleTonUsingClass singleTonUsingClass;

	private SingleTonUsingClass(){}
	
	public static SingleTonUsingClass getInstance() {
		System.out.println("Inside getInstance method...");
		System.out.println("Inside getInstance method on a different branch...");
		if (singleTonUsingClass == null) {
			synchronized (SingleTonUsingClass.class) {
				if (singleTonUsingClass == null) {
					singleTonUsingClass = new SingleTonUsingClass();
					System.out.println("inside first creation of object ...");
				} else {
					return singleTonUsingClass;
				}
			}
		}

		return singleTonUsingClass;
	}

	public Object clone() {
		return singleTonUsingClass;
	}
}
