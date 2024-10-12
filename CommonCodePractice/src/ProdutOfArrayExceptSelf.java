import java.util.Arrays;
import java.util.Iterator;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
		
*/

public class ProdutOfArrayExceptSelf {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4,5 };
		System.out.println("Array        :" + Arrays.toString(arr));
		System.out.println("Final        :" + Arrays.toString(getProdutOfArrayExceptSelf(arr)));

	}

	public static int[] getProdutOfArrayExceptSelf(int[] arr) {

		int[] prefixArr = getPrefixProdutArray(arr);
		int[] suffixArr = getSuffixProdutArray(arr);
		int length = arr.length;
		int[] produtOfArrayExceptSelf = new int[length];
		
		for (int i = 0; i < length; i++) {
			produtOfArrayExceptSelf[i] = prefixArr[i] * suffixArr[i];
		}
		return produtOfArrayExceptSelf;
	}

	public static int[] getPrefixProdutArray(int[] arr) {

		int length = arr.length;
		int[] prefixArr = new int[length];
		prefixArr[0] = 1;

		for (int i = 1; i < length; i++) {
			prefixArr[i] = prefixArr[i - 1] * arr[i - 1];
		}

		System.out.println("Prefix array :" + Arrays.toString(prefixArr));
		return prefixArr;
	}

	public static int[] getSuffixProdutArray(int[] arr) {

		int length = arr.length;
		int[] suffixArr = new int[length];
		suffixArr[length - 1] = 1;

		for (int i = length - 2; i >= 0; i--) {
			suffixArr[i] = suffixArr[i + 1] * arr[i + 1];
		}
		System.out.println("Suffix array :" + Arrays.toString(suffixArr));

		return suffixArr;
	}

}
