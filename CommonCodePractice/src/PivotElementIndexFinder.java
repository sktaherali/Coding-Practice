import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array, find an element before which all elements are smaller than it, and after which all are greater than it.
 *  Return the index of the element if there is such an element, otherwise, return -1.
Input: arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
Output: 4
Input: arr[] = {5, 1, 4, 4};
Output: -1*/


public class PivotElementIndexFinder {

	public static void main(String[] args) {
		

		Integer [] numbers = new Integer[] {5, 1, 4, 3, 6, 8, 10, 7, 9};
		
		
		// Normal logic, Time complexity is O(n2)
		getIndexOfTheEmamentNormalLogic(numbers);
		
		// Time complexity is O(n)
		getIndexOfTheEmamentOptiizedLogic(numbers);
		
		
	
		
	}
	
	
	
	public static void getIndexOfTheEmamentNormalLogic(Integer [] numbers) {
		
		int length = numbers.length;
		if(length<= 2) {
			System.out.println("index is::" + -1);
			return;
		}
		
		Boolean checkPoint = true;
		 
		 
		 for(int i = 0; i < length-1; i++) {
			 
			 Boolean checkPoint1 = true;
			 
			 for(int j = i; j< length-1; j++) {
				 if(numbers[i]> numbers[j] ) {
					 checkPoint1 = false;
					 break;
					
				 }
			 }
			 
			 for(int j = i-1; j>= 0; j--) {
				 if(numbers[i]< numbers[j] ) {
					 checkPoint1 = false;
					 break;
				 }
			 }
			 
			 if(checkPoint1) {
				 System.out.println("index is::" + i);
				 checkPoint = false;
				 break;
			 }
			
		 }
		 
		 if(checkPoint) {
			 System.out.println("index is::" + -1);
			 
		 }
	}

	public static void getIndexOfTheEmamentOptiizedLogic(Integer [] numbers) {
		
		int length = numbers.length;
		if(length<= 2) {
			System.out.println("index is::" + -1);
			return;
		}
		
		int [] leftMax = new int[length];
		int [] rightMin = new int[length];
		
		leftMax[0] = numbers[0];
		rightMin[length-1] = numbers[length-1];
		
		for(int i = 1; i<length ; i++) {
			
			leftMax[i] = Math.max(leftMax[i-1], numbers[i]); 
		}
		
       for(int i = length-2; i>=0 ; i--) {
			
    	   rightMin[i] = Math.min(rightMin[i+1], numbers[i]); 
		}
       
       for(int i = 1; i<length-1 ; i++) {
			
			if(numbers[i] > leftMax[i-1] && numbers[i] < rightMin[i+1] ) {
				 System.out.println("index is:: " + i);
	                return;
			}
		}
       
       System.out.println("index is:: -1");
		
	}
}
