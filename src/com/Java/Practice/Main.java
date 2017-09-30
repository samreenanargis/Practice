package com.Java.Practice;

public class Main {

	public static void main(String[] args) {
		Arraylist arrayList = new Arraylist();
		arrayList.addIntArray(90);
		arrayList.addIntArray(20);
		arrayList.addIntArray(50);
		arrayList.addIntArray(30);
		arrayList.printIntArray();
		arrayList.sortIntArray(arrayList.intArray, false);
		

	}

}
