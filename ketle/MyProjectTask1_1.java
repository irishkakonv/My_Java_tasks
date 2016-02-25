
public class MyProjectTask1_1 {

	public static void main(String[] args) {
		MyProjectTask1_2 genderMW= new MyProjectTask1_2();
		genderMW.Scan();
		float Kettle= count(genderMW.growth, genderMW.weight);
		if (Kettle<=18.5) {
			System.out.println("Your Quetelet index is " + Kettle + ": the deficit of body weight");
		}
		
		else if (18.5<Kettle && Kettle<=24.99){
			System.out.println("Your Quetelet index is " + Kettle + ": norma");
		}
		
		else if (25<Kettle && Kettle<=30) {
			System.out.println("Your Quetelet index is " + Kettle + ": overweight");
		}
		
		else if (30<Kettle && Kettle<=35) {
			System.out.println("Your Quetelet index is " + Kettle + ": obesity of the first degree");
		}
		
		else if (35<Kettle && Kettle<=40) {
			System.out.println("Your Quetelet index is " + Kettle + ": obesity of the second degree");
		}
		
		else  {
			System.out.println("Your Quetelet index is " + Kettle + ": obesity of the third degree");
		}
	}
	
	private static float count (float x, float y){
		x = x/100;
		float Kettle=y/(x*x);
		return Kettle;
	}
	
	

}
