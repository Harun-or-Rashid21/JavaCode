package enu.practice;


enum Month{
	JULY, OCTOBOR;
}

public class EnumPractice {

	public static void main(String[] args) {
		
		Month birth = Month.OCTOBOR;
		
		
		if(birth == Month.JULY) {
			System.out.println("It's My Birthday!!!!!");
		}else if(birth == Month.OCTOBOR){
			System.out.println("It's My Heart's Birthday!!!!!");
		}else {
			System.out.println("NOTHING");
		}
		
		
		switch (birth) {
		 case JULY:
			 System.out.println("It's My Birthday!!!!!");
			 break;
		 case OCTOBOR:
			 System.out.println("It's My Heart's Birthday!!!!!");
			 break;
		 default:
			 System.out.println("Nothing!!!!!");
			 break;
		}
		
	}
	
	


}
