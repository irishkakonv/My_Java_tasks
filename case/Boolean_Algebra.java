package Boolean_Algebra;

public class Boolean_Algebra {
	public static int boolC(int a, int b){
		if (a == 0 && b == 0) return 0;
		if (a == 1 && b == 0) return 0;
		if (a == 0 && b == 1) return 0;
		if (a == 1 && b == 1) return 1;
		return -1;
	}
	public static int boolD(int a, int b){
		if (a == 0 || b == 0) return 0;
		if (a == 1 || b == 0) return 1;
		if (a == 0 || b == 1) return 1;
		if (a == 1 || b == 1) return 1;
		return -1;
	}
	public static int boolI(int a, int b){
		if ((a == 0 && b == 0) || (a == 0 && b == 1) || (a == 1 && b == 1)) return 1;
		if (a == 1 && b == 0) return 0;
		return -1;
	}
	public static int boolEx(int a, int b){
		if ((a == 0 && b == 0) || (a == 1 && b == 1)) return 0;
		if ((a == 0 && b == 1) || (a == 1 && b == 0)) return 1;
		return -1;
	}
	public static int boolEq(int a, int b){
		if ((a == 0 && b == 0) || (a == 1 && b == 1)) return 1;
		if ((a == 0 && b == 1) || (a == 1 && b == 0)) return 0;
		return -1;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		String str = "implication";
		if (str == "conjunction") System.out.println("boolean(" + a +", " + b + ", \"" + str + "\") == " + boolC(a, b));
		if (str == "disjunction") System.out.println("boolean(" + a +", " + b + ", \"" + str + "\") == " + boolD(a, b));
		if (str == "implication") System.out.println("boolean(" + a +", " + b + ", \"" + str + "\") == " + boolI(a, b));
		if (str == "exclusive") System.out.println("boolean(" + a +", " + b + ", \"" + str + "\") == " + boolEx(a, b));
		if (str == "equivalence") System.out.println("boolean(" + a + ", " + b + ", \"" + str + "\") == " + boolEq(a, b));
	}

}
