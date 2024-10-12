import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println(getFirstNonRepeatedChar("i    1188i"));
	}
	
	public static Character getFirstNonRepeatedChar(String str) {
		
		Character firstNonRepeatigChar = null;
		
		char[] charArr = str.toCharArray();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for (char ch:charArr) {
			if(ch != ' ')
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		for (char ch:charArr) {
			if(countMap.get(ch) != null && countMap.get(ch) == 1) {
				firstNonRepeatigChar = ch;
				break;
			}
		}
		return firstNonRepeatigChar;
	}

}
