
/* JAC444 - Workshop 1 
 * Student: Muntaqa Maahi - 164356180
 * Date: June 1,2020 (Summer)
 */
 

package a1; 
import java.util.*;   

public class Palindrome {
	
	
	
	public static void checkPalindrome(String input) {
		
		Stack stack = new Stack();
		String revString = new String();
		
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		for (int i = 0; i < input.length(); i++) {
			revString += stack.pop();
		}
		
	
		if(revString.equalsIgnoreCase(input)) {
		
			System.out.println("This is Palindrome!");
		}else{
			
			System.out.println("This is NOT Palindrome.....");
		}		
			
		
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		 Scanner in = new Scanner(System.in);  
		 System.out.println("Enter a string to check if it is a palindrome:");
		 String input = in.nextLine();	 
		 checkPalindrome(input);

	     
	     
	
	}
}
