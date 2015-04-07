package com.mandy.designpatt;

public enum SingleTonUsingEnum {

	SINGLEINSTANCE;
	
	private SingleTonClass singleTonClass;
	SingleTonUsingEnum(){
		singleTonClass = new SingleTonClass();
		System.out.println("first Time Invoke");
	}
	
	public SingleTonClass getSingleTonClass() {
		System.out.println("SingleTonClass object returned......");
		return singleTonClass;
	}
	
	
}
