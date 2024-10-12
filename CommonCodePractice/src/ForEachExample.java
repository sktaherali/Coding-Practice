package test;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,7);
		
		for(Integer i:list) {
			
			System.out.println(i);
		}
		
		list.forEach(i->{
			int j =i;
			System.out.println(j);
		});

	}

}
