/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int isSunday=1;
	    int sundayCounter = 0;
	    int firstAndSunday = 0;
	    int currentYear = 1900;
	    while(currentYear<=1999){
	    	while(month<=12){
	    		while(dayOfMonth<=nDaysInMonth(month,currentYear)){
	    			if(isSunday%7==0){
	    				System.out.println(dayOfMonth+"/"+month+"/"+currentYear+ " Sunday");
	    				sundayCounter+=1;
	    				if(dayOfMonth == 1){
	    					firstAndSunday+=1;
	    				}
	    			}
	    			else{
	    			System.out.println(dayOfMonth+"/"+month+"/"+currentYear);
	    		}
	    			dayOfMonth+=1;
	    			isSunday+=1;
	    	}
	    	month+=1;
	    	dayOfMonth = 1;
	    }
	    currentYear+=1;
	    month = 1;

	    }
	    System.out.println("During the 20th century, " + firstAndSunday + " Sundays fell on the first day of the month");
	}
	  
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
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