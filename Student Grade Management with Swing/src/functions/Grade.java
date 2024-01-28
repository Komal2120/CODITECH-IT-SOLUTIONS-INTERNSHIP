package functions;

public class Grade {

	public static String calculateGrade(int total) {
		// TODO Auto-generated method stub
		
		float percent = total*100/400;
		
		if(percent>=90 && percent<=100) {
			return "A" ;
		}
		else if(percent>=80 && percent<=89) {
			return "B" ;
		}else if(percent>=70 && percent<=79) {
			return "C" ;
		}else if(percent>=60 && percent<=69) {
			return "D" ;
		}else if(percent>=50 && percent<=59) {
			return "E" ;
		}
		
		return "F";
	}
	

}
