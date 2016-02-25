import java.util.*;

public class MyProjectTask1_2 {
	String gender;
	float growth;
	float weight;
	
	public void Scan(){
		System.out.println("Enter our gender (men or women): ");
		Scanner genderMenWomen= new Scanner (System.in);
		gender=genderMenWomen.next();
		gender=gender.toLowerCase();
		
		System.out.println("Enter our growth: ");
		Scanner growthMenWomen= new Scanner (System.in);
		growth=growthMenWomen.nextFloat();
		
		System.out.println("Enter our weight: ");
		Scanner weightMenWomen= new Scanner (System.in);
		weight=weightMenWomen.nextFloat();
		
		
	}

}
