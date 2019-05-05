package challenges;

public class CenturyFromYear {

	/*
	 * Given a year, return the century it is in. 
	 * The first century spans from the year 1 up to and including the year 100, 
	 * the second - from the year 101 up to and including the year 200, etc.
	 */
	
	public static void main(String[] args) {
		System.out.println(centuryFromYear(2004));
		centuryFromYear(2004);
	}
	
	 static int centuryFromYear(int year) {
	    return (int)((year - 1) / 100) + 1;
	}

}
