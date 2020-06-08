
/* JAC444 - Workshop 1 
 * Student: Muntaqa Maahi - 164356180
 * Date: June 1,2020 (Summer)
 */
package a1;


public class Stack {
	private char word[];
	
//constructor
	public Stack() {
		word = new char[0];
	}
	
//adding/resizing letter to array
	public void push(char newChar) {
		char[] temp = new char[size() + 1];
		System.arraycopy(word, 0, temp, 0, word.length);
		temp[word.length] = newChar;
		word = temp;
	}

	
	//Remove top letter and return
	public char pop() {
		char rtnChar = '\u0000';
		if (word.length > 0) {
			rtnChar = word[word.length - 1];
			char[] temp = new char[word.length - 1];
			System.arraycopy(word, 0, temp, 0, temp.length);
			word = temp;
		}
		return rtnChar;	
	}
	
	
	public char top() {
		return word.length > 0 ? word[word.length - 1] : '\u0000';
	}
	

	public boolean isEmpty() {
		return word.length == 0 ? true : false;
	}
	

	public int size() {
		return word.length;
	}
}
