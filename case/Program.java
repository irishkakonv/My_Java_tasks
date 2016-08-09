package Program;

public class Program {
	 public static int Puzzle(int number, int power) {    
         int m = (int)Math.pow(number, power);
         return m;
    }

	public static void main(String[] args) {
		System.out.println(Puzzle(-11, 9));
	}

}
