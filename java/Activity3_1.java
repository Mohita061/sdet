package JavaActvity3;

import java.util.ArrayList;

public class Activity3_1 {
	public static void main(String[] args) {
		//declaring arraylist of string objects
		
		ArrayList <String> myList = new ArrayList <String>();
		
		myList.add("Krishiv");
		myList.add("Rani");
		myList.add("Ananya");
		myList.add("Raju");
		myList.add("Shree");
		
		System.out.println ("Print all the names:");
		
		for (String s:myList) {
			System.out.println (s);		
		}
		
		
        
		System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Rani is in list: " + myList.contains("Rani"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Raju");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}