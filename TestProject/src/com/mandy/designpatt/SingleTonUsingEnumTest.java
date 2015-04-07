package com.mandy.designpatt;

public class SingleTonUsingEnumTest {

	public static void main(String s[]) {
		SingleTonUsingEnum.SINGLEINSTANCE.getSingleTonClass();
		SingleTonUsingEnum.SINGLEINSTANCE.getSingleTonClass();
		SingleTonUsingEnum.SINGLEINSTANCE.getSingleTonClass();
		SingleTonUsingEnum.SINGLEINSTANCE.getSingleTonClass();
		SingleTonUsingEnum.SINGLEINSTANCE.getSingleTonClass();
	}
}
