

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static  void getTheLargestNumber(String []str) {
		
		Arrays.sort(str, (a1,a2)->  a2.compareTo(a1));
		
		String strFinal = "" ;
		for (String c : str) {

			strFinal = strFinal + c;
		}
		
		System.out.println(strFinal);
	}

	public static void main(String[] args) {
		
		String []str = {"3","30","34","5","9"} ;
		getTheLargestNumber(str);
	}
}
