package task14p172;

class Cla{
	static String d = "mama";
	static String a;
	static{
		  a = "papa";
	}
	Cla(){}
	static void f(){
		System.out.println(a);
		System.out.println(d);
		}
}
public class task14p172 {
	public static void main(String[] args){
		Cla.f();
	}
}
