import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Given the list of integers [1,2,3,4,5,6,2,5,6], find the second largest element of the list using core java/java8?
public class TestQuestion {

	public static void main(String[] args) {
		
		int [] numberArray = new int[] {1,2,3,4,5,6,2,5,6};
		Arrays.asList(numberArray);
		
		List< Integer> integers = Arrays.asList(1,2,3,4,5,6,2,5,6);
		
	
		Optional<Integer> findFirst = integers.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();
		
		
		findFirst.ifPresent(value -> System.out.println( "From Stream :" + value));

		getSecondLargestUsingNormalCode(integers);
		
		// filter out even numbers
		
		integers.stream().filter(i -> i%2 ==0).forEach(System.out::println);
		List<Integer> collect = integers.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		
		
		// Find the specific number from arrays that is greater than 20 using Stream API.

		
		  List<Integer> collect2 = Arrays.asList(23,14,15,6).stream().filter(i -> i>20).collect(Collectors.toList());
		  collect2.forEach(System.out:: println);
		
		  // Count the occurrence of a given character in a String using Stream API.
		  
		  String characters = "Sk Taher Aliaaaaaaaaa";
		  String[] charArray = characters.replaceAll(" ", "").toUpperCase().split("");
		  Map<String, Long> collect3 = Arrays.asList(charArray).stream().collect(Collectors.groupingBy(c->c, Collectors.counting()));
		  collect3.forEach( (a,b) ->System.out.println("Character-"+ a +":: Value-"+b));
		
	}
	
	public static void getSecondLargestUsingNormalCode(List<Integer> integers) {
		
		Integer largest = Integer.MIN_VALUE;
		Integer secondLargest = Integer.MIN_VALUE;
		
		for(Integer number : integers) {
			if(number > largest) {
				secondLargest = largest;
				largest = number;
			}else if(number < largest && number > secondLargest) {
				
				secondLargest = number;
			}
		}
		
		 System.out.println( "From getSecondLargestUsingNormalCode :" + secondLargest);
	}

}
