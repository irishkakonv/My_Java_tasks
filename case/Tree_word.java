package Tree_word;

public class Tree_word {
	public static void check(String str){
		int count = 0;
		char[] cArray = str.toCharArray();
		for(int i = 0; i < str.length(); i++ ){
			if (cArray[i] >= 'a' && cArray[i] <= 'z' || cArray[i] == ' ' || cArray[i] >= 'A' && cArray[i] <= 'Z'){
				if (cArray[i] == ' ' || i == str.length()-1)
					count++;	
			}	
			else count = 0;
		}	
		if (count == 3) {
			System.out.println("checkio(\"" + str + "\") == True");
		}
		else {System.out.println("checkio(\"" + str + "\") == False");
		}
	}

	public static void main(String[] args) {
		String str = "Hello World gfd";
		check(str);

	}

}
