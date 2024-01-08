/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2; 
	static int nDaysInMonth = 31; 
	
	public static void main(String args[]) {
		int currentYear = Integer.parseInt(args[0]);
	    int isSunday=firstDayOfYear(currentYear);
	    System.out.println(isSunday);	
	    while(month<=12){
	    		while(dayOfMonth<=nDaysInMonth(month,currentYear)){
	    			if(isSunday%7==0){
	    				System.out.println(dayOfMonth +"/"+month+"/"+currentYear+" Sunday");
	    			}
	    			else{
	    				System.out.println(dayOfMonth +"/"+month+"/"+currentYear);
	    			}
	    			isSunday+=1;
	    			dayOfMonth+=1;
	    				
	    			
	    		}
	    	
	    	month+=1;
	    	dayOfMonth = 1;
	    	
	    }
	}
	public static int firstDayOfYear (int year){
		int daysCounter = 1;
		int startYear = 1990;
		while(startYear<year){
		for(int i = 1;i<13;i++){
			daysCounter+=nDaysInMonth(i,startYear);
		}
		startYear+=1;
	}
	return (daysCounter%7);
	}


	  
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    int i = 0;
		boolean check = false;
	    while(2024 - (4*i)!=year&&(i*4)<=2024){
	    	i+=1;
	    }
	    if(2024 - (4*i)==year){
	    	check = true;
	    }
		return check;
		}
	 
	private static int nDaysInMonth(int month, int year) {
		if(month==4||month==6||month==9||month==11){
				return 30;
			}
			if(month==2){
				if(isLeapYear(year)){
					return 29;
				}
				if(!isLeapYear(year)){
					return 28;
				}
			}
			
			return 31;
	}
}