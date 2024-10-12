package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamGFIOrstNonRepeatChar {

	public static void main(String[] args) {
		
	List <Integer> list1= Arrays.asList(9, 3, 5, 2, 9, 1, 22, 33, 3787, 22487);
	List <Integer> list2 = list1.stream().sorted((val1,val2) -> {return val2.compareTo(val1);}).collect(Collectors.toList());
	List <Integer> list3 = list1.stream().sorted((val1,val2) -> {return val1.compareTo(val2);}).collect(Collectors.toList());
	
	System.out.println("Reverse order"+list2);
	System.out.println("Normal order order"+list3);
	
	double avg = list1.stream().mapToInt(i->i).average().getAsDouble();
	System.out.println(avg);
	
	List startsWith2 = list1.stream().map(a-> String.valueOf(a)).filter(a -> a.startsWith("2")).map(a -> Integer.valueOf(a)).collect(Collectors.toList());
	
	System.out.println(startsWith2);
		
	}

}
