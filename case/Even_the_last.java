package Even_the_last;
import java.util.*;

public class Even_the_last {
	public static int even_the_last(int[] arr){
		int i = 0;
		int sum = 0;
		while(i < arr.length){
			sum += arr[i];
			i += 2;
		}
		int multiply = sum * arr[arr.length-1];
		return multiply;
	}

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3, 4, 5};
		System.out.println("checkio(" + Arrays.toString(arr1) +") == " + even_the_last(arr1));
		int[] arr2 = {1, 3, 5};
		System.out.println("checkio(" + Arrays.toString(arr2) +") == " + even_the_last(arr2));
		int[] arr3 = {6};
		System.out.println("checkio(" + Arrays.toString(arr3) +") == " + even_the_last(arr3));
		int[] arr4 = {0};
		System.out.println("checkio(" + Arrays.toString(arr4) +") == " + even_the_last(arr4));
	}

}
