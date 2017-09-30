package com.Java.Practice;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	
	public ArrayList<Integer> intArray = new ArrayList<Integer>();
	
	//This method adds value to the ArrayList intArray.
	public void addIntArray(int intValue) {
		intArray.add(intValue);
	}
	
	
	//This method iterates through the ArrayList intArray and prints the values in intArray.
	public void printIntArray() {
		for(int i=0; i<intArray.size(); i++) {
			System.out.println((i+1 +" : " + intArray.get(i)));
		}
	}
	
	
	//This method takes in ArrayList intValue and Boolean isAscending for arguments and sorts the values in intValue in ascending or descending order.
	public void sortIntArray(ArrayList array, Boolean isAscending) {
		if (isAscending) {
			Collections.sort(intArray);
			for(int ascend:intArray) {
				System.out.println(ascend);
			} 
		}
			else {
				Collections.sort(intArray,Collections.reverseOrder());
				for(int descend:intArray) {
					System.out.println(descend);
			}
		}
	}
}


