// print max number of pares that is having same sum with non intersecting segments
//{1, 2,3,2,1,4,5,3,12,233,2,3, 3,33, 1 , 2,2,3,}
// adjacent pares ---- (1,2) (2,3)(3,2),(2,1) (1,4)(4,5) (5,3)
// --- pares should not contain reverse pares,  means id (1,2) is present then (2,1) should not be there
//Find the maximum count of pares with   same sum with non intersecting segments



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMazimumPares {

	public static int maxNumberOfParesWithSameSum(int[] numbers) {

		int maxVal = 0;
		List<String> pares = new ArrayList<>();
		Map<Integer, Integer> countMap = new HashMap();

		for (int i = 0; i < numbers.length - 1; i++) {
			Integer a1 = numbers[i];
			Integer a2 = numbers[i + 1];
			
			String key = a1.toString() + a2.toString();
			String keyReverse = a2.toString() + a1.toString();

			if (!pares.contains(keyReverse)) {
				pares.add(key);
				int sum = a1 + a2;

				countMap.put(sum, countMap.getOrDefault(sum, 0) + 1);
				maxVal = Math.max(maxVal, countMap.get(sum));
			}

		}
		System.out.println(pares);
		System.out.println(countMap);

		return maxVal;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 0, 2, 2, 2, 4, 1, 2, 3, 2, 4, 2, 1, 0, 1, 0, 2, 0, 3, 1, 3, 2, 2, 1, 4, 0 };
		System.out.println(maxNumberOfParesWithSameSum(numbers));
	}
}