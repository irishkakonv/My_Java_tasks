package Secret_Message;

public class Secret_Message {
	public static void deside(String str){
		String ch = new String();
		char[] chArray = str.toCharArray();
		for (int i = 0; i < chArray.length; i++){
			if(chArray[i] >= 'A' && chArray[i] <= 'Z' ){
				ch = ch + chArray[i];
			}
		}
		System.out.println("find_message(\""+ str + ") == " + "\"" + ch + "\"");
	}

	public static void main(String[] args) {
		String str = "How are you? Eh, ok. Low or Lower? Ohhh.";
		deside(str);

	}

}
