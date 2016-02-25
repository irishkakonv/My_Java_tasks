
public class MyProjectCase {

	public static void main(String[] args) {
			
		Date r=new Date ();
		r.Scan();
		
		switch (r.a)
		{
		case "january" : 
		case "1" : 
		case "march": 
		case "3":
		case "may": 
		case "5": 
		case "july": 
		case "7": 
		case "august": 
		case "8": 
		case "october": 
		case "10": 
		case "december": 
		case "12": 
			System.out.println("31");
				break;
			
		case "february": 
		case "2": System.out.println("29");
			break;
			
		case "april":
		case "4": 			
		case "june": 
		case "6": 		
		case "september": 
		case "9": 
		case "november": 
		case "11": System.out.println("30");
			break;	
		
		default: System.out.println("Please take again!");
			}
	
		}
	
		

}
