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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class StringTest {
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void testStringMethods() {
		java.lang.String s = "Message";
		String str = new String(s);
		assertTrue(str.getLength(s) == getLength(s));
	}
	
	/** Test length method */
	public int getLength(java.lang.String s) {
		return s.length();
	}
	
	/** Test charAt method to get first letter of String */
	public char getCharAt(java.lang.String s) {
		return s.charAt(0);
	}
	
	/** Test substring method to get first 4 letters of String*/
	public java.lang.String getSubstring(java.lang.String s){
		return s.substring(0, 3);
	}
	
	/** Test indexOf method to get index of the char 'g' */
	public int getIndexOf(java.lang.String s) {
		return s.indexOf('g');
	}
}
