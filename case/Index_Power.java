package Index_Power;
import java.lang.Math;
import java.util.*;

public class Index_Power {
	public static int index_power(int[] arr, int n){
		if (n >= arr.length) return -1;
		if (n < 0) return -1;
		if (n > 0 && n < arr.length){
			int a = arr[n];
			a = (int) Math.pow(a, n);
			return a;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 10, 100};
		int n = 3;
		System.out.println("index_power ([" + Arrays.toString(arr) + "], " + n + ") == " + index_power(arr, n));
		
	}

}
