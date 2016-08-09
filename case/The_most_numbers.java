package The_most_numbers;

import java.util.Arrays;

public class The_most_numbers {
	public static float min(float[] arr){
		float min_number = arr[0];
		for(int i = 1; i < arr.length; i++){
			if (arr[i] < min_number) min_number = arr[i];
		}
		return min_number;
	}
	public static float max(float[] arr){
		float max_number = arr[0];
		for(int i = 1; i < arr.length; i++){
			if (arr[i] > max_number) max_number = arr[i];
		}
		return max_number;
	}
	public static float different_max_min(float[] arr){
		if (arr.length == 0) return 0;
		float difference = max(arr) - min(arr);
		return difference;
	}
	
	public static void main(String[] args) {
		float[] array = {};
		System.out.println("checkio(" + Arrays.toString(array) + ") == " + different_max_min(array));
	}

}
