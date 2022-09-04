package helloword;
import java.io.IOException;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen
 * <p>
 * <h>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * 
 * @author Zahra
 * @version 1.0
 * @since 2022/08/29
 */


public class AddNum {
	/**
	 * This method is used to add two integer. This is 
	 * a the simplest form of a class method, just to
	 * show the usage of various javadoc Tags.
	 * @param numA This is the first paramter to addNum method
	 * @return int This returns sum of numA and numB.
	 */
	 
	public int addNum (int numA, int numB) {
		return numA + numB;
	}
	/**
	 * This is the main method which makes use of addNum method.
	 * @param args unused
	 * @exception TOException On input error.
	 * @see IOException
	 */
	
	public static void main(String args[]) throws IOException {
		AddNum obj = new AddNum();
		int sum = obj.addNum(10, 20);
		
		System.out.println("Sum of 10 and 20 is :" + sum);
	}
}