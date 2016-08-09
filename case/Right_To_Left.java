package Right_To_Left;

import java.util.Arrays;

public class Right_To_Left {
	public static void main(String[] args){
		String[] str = {"bright aright", "ok"};
		String[] str_new = str;
		for(int i = 0; i < str.length; i++){
			str_new[i] = str[i].replace("right", "left");
		}
		System.out.println("left_join(" + Arrays.toString(str) + ") == " + Arrays.toString(str_new) + ";");
		
	}

}
