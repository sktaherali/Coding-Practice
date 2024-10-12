package test;

public class FirstNotIntegerCharOfaString {

	public static void main(String[] args) {
		
		String str = getFirstNonINtChar("111111111111111112345676543234567Kxjhxhg678dhdbdb");
		System.out.println(str);
	}
	
	
	public static String getFirstNonINtChar(String str) {
		if(str== null || str == "") {
			return null;
		}
		
		char[] charArr = str.toCharArray();
		for(char ch: charArr) {	
			try {
				int intVal = Integer.parseInt(String.valueOf(ch));
				
			}catch (Exception e) {
				return String.valueOf(ch);
			}
		}
		return null;
	}
}
