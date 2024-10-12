package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		List<Integer> list1 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(list1);
		List<Integer> list2 = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list2);
	}

}
