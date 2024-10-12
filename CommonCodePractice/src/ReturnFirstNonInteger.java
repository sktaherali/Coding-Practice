
public class ReturnFirstNonInteger {

	public static void main(String[] args) {

		System.out.println(getFirstNonIntChar("    8     u"));
		
	}
	
	
	public static Character getFirstNonIntChar(String str) {
		
		char[] chatArr = str.toCharArray();
		Character ch1 = null ;
		for(char ch: chatArr) {
			try {
				if(ch!=' ')
				Integer.valueOf(ch+"");
			}catch (Exception e) {
				ch1 = ch;
				break;
			}
		}
		return ch1;
		
	}

}
