package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheMaximumCountOfParesWithSame {

public static int maxNumberOfParesWithSameSum(int[] numbers) {
	
	
	
	List<String> pares1 = new ArrayList<>();
		
		Map<String, Integer> maxVal = new HashMap<String, Integer>();
		
		Map<String,List<Integer>> pares = new  HashMap();
		
		for(int i =0; i<numbers.length-1; i++) {
			
			String key = ""+numbers[i]+ numbers[i+1];
			String keyReverse = ""+numbers[i+1]+ numbers[i];
			
			List<Integer> val = new ArrayList();
			val.add(numbers[i]);
			val.add(numbers[i+1]);
			if(!pares.containsKey(keyReverse)) {
				pares.put(key, val);
				pares1.add(key);
			}
			
		}
		
		System.out.println(pares1);
		
		
		Map<Integer,Integer> countMap = new HashMap();
		
		pares.forEach((key,val) -> {	
			
			int sum = val.get(0)+val.get(1);
			countMap.put(sum, countMap.getOrDefault(sum, 0)+1);
			maxVal.put("maxVal", Math.max(maxVal.getOrDefault("maxVal",0), countMap.get(sum))) ;
		});
	
		return maxVal.get("maxVal");
	}

    public static void main(String[] args) {
        int[] numbers = {1, 2, 0, 2, 4, 1, 2, 3, 2, 4, 2, 1, 0, 1, 0, 2, 0, 3, 1, 3, 2, 2, 1, 4,0};
        System.out.println(maxNumberOfParesWithSameSum(numbers));
    }
}





