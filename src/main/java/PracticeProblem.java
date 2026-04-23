public class PracticeProblem {

	public static void main(String args[]) {}

		public static String pluralize(String word) {
    if (word.toLowerCase().endsWith("ey")) {
        return "eys";
    } else if (word.toLowerCase().endsWith("y")) {
        return "ies";
    } else if (word.toLowerCase().endsWith("ife")) {
        return "ives";
    } else {
        return "s";}
    }
    
	public static int min(int a, int b, int c) {
    if (a <= b && a <= c) {
        return a;
    } else if (b <= a && b <= c) {
        return b;
    } else {
        return c;
    }
    
    }

    public static boolean isLeapYear(int year) {
    if (year % 4 == 0) { 
        if (year % 100 == 0) { 
            if (year % 400 == 0) { 
                return true; 
            } else {
                return false; 
            }
        } else {
            return true; 
        }
    } else {
        return false; 
    }
}

	} 

	
	


