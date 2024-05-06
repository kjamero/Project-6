/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Write a JUnit test class to test the methods length, charAt, 
 * 				substring, and indexOf in the java.lang.String class.
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kyrene Jamero
*/

public class String {
	private java.lang.String s;
	/** Default constructor */
	public String() {
		this.s = ("Message");
	}
	
	/** Construct a message with specified message over 4 letters*/
	public String(java.lang.String s) {
		this.s = s;
	}
	/** length method */
	public int getLength(java.lang.String s) {
		return s.length();
	}
	
	/** charAt method to get first letter of String */
	public char getCharAt(java.lang.String s) {
		return s.charAt(0);
	}
	
	/** substring method to get first 4 letters of String*/
	public java.lang.String getSubstring(java.lang.String s){
		return s.substring(0, 3);
	}
	
	/** indexOf method to get index of the char 'g' */
	public int getIndexOf(java.lang.String s) {
		return s.indexOf('g');
	}
	
}
