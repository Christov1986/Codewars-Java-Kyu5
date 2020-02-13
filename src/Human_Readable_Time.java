/* Author - Christov van Heerden
 * Date - 2020-02-13
 * CodeWars exercises - 5Kyu
 * Human Readable Time

Write a function, which takes a non-negative integer (seconds) as input 
and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59

The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.

*/

public class Human_Readable_Time {
	public static void main(String args[]) {
		System.out.println(makeReadable(0) + " = 00:00:00");
		System.out.println(makeReadable(5) + " = 00:00:05");
		System.out.println(makeReadable(60) + " = 00:01:00");
		System.out.println(makeReadable(86399) + " = 23:59:59");
		System.out.println(makeReadable(359999) + " = 99:59:59");
	}
	
	
	public static String makeReadable(int seconds) {
	    // Extract hours and remove from the total seconds
		int hours = seconds / 3600;
		seconds = seconds - (hours * 3600);
		
		// Extract minutes and remove from the total seconds
		int minutes = seconds / 60;
		seconds = seconds - (minutes * 60);
		
	    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	  }
	
}
