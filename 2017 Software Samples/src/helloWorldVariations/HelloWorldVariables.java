package helloWorldVariations;

/*
 * Yes, I know there are errors in this class. Yes, they are on purpose. Yes, I expect you to read EVERY comment.
 */

public class HelloWorldVariables {
	//variables declared up here have two options: they can be scoped to the class, or scoped to the project.
	//private variables are class only, public variables are project. Those will be more useful in the robot;
	//right now we have only one class. The important types of variables are: 
	//String, char, int, double, boolean. 
	//There are more, but we won't likely need them for programming the robot.
	//char variables store characters in the form 'c'. 
	//Strings are sequences of characters (technically an object) in the form "string".
	//int and double are number types: int is an integer, double is a decimal.
	//Boolean is a true or false variable. They're very useful for logic and if..then..else statements.
	
	//Note that no two variables with the same scope can share a name. Scopes are nested: a global scope contains all class scopes,
	//class scopes contain all class methods, method scope contains all ifs and loops, and so on and so forth.
	//Therefore, if you name a global variable myGlobalVariable, don't name any other variables in the same project myGlobalVariable!
	
	public int myPublicInt = 1;
	private int myPrivateInt = -0; //this works because there is a single bit (a binary 1 or 0) way on the end of the integer
								   //that tells it if it is positive or negative. So, you can have negative 0.
	
	public static void main(String[] args) {
		//variables declared inside the method brackets (more on those later) are scoped to that method alone.
	
		String myString = "Hello, World";
		char myChar = '_';
		int myInt = 1234567890;
		double myDouble = 1234567890.0987654321;
		boolean myBoolean = false;
		
		System.out.println("Hello, World");
		System.out.println(myString); //use variables when you want to transfer and manipulate data inside a program.
		
		System.out.println(myChar);
		
		System.out.println(myInt);
		System.out.println(myDouble); //notice that this printed in scientific notation - that's just a shenanigan 
									  //by the println method. the number is still the same for math
		System.out.println(myBoolean);
		
		//variables can be cast into different types
		//notably, when you cast a double to an int, what do you think happens? Think of it like pouring metal.
		//integers are round numbers, but doubles have a little bit left over (the decimal...) that gets lost.
		//Play around with casting variables!
		
		System.out.println((int) myDouble); //this is an example of casting the double myDouble into an int.
		System.out.println((int) myString); //notice this is an error: you cannot cast Strings to ints. Play around with it!
		System.out.println((int) myChar); //chars can be cast to ints because software does a thing called encoding where every
										  //character has a number.
										  //if you can cast a char to an int, do you think we can cast an int to a char?
		System.out.println((char) myInt); //YES YOU CAN!
		
		System.out.println((String) myChar); //Strange. Why can't you cast a char to a string? 
		//Strings are objects - a unique data type. We will cover objects later, 
		//but think of them like this: you can make your own data type with objects - and manipulate it nicely
		
		//there are a few special characters that are useful when working with strings or chars. One is the \n character,
		//that creates a new line. Alternatively, you can type "System.out.println();". Same thing.
		
		//Now, let's do math! Math in software is pretty easy: addition is the plus sign +, subtraction is the minus sign (hyphen) -,
		//multiplication is the asterisk *, division is the forward slash /. The equals sign is assignment, not equality. This means
		//that computers can't solve equations like x = 3; x + y = 4, what does y equal? Instead, y = 4-x is like storing 4-x in the
		//spot y in the computer. If that's confusing, just remember only one thing - a variable - can be left of a single equals sign.
		//Computers do, however, follow order of operations (PEMDAS) to the letter.
		
		System.out.println(2*3);
		int x = 2;
		int y = 3;
		System.out.println(x*y);
		int z = x * y;
		System.out.println(z); //all three of these printlns are the same!
		//Try some math on your own. Remember, +, -, *, /.
		
		//Believe it or not, you can add strings and chars together with a simple plus sign.
		String s1 = "Hello";
		char space = ' ';
		String s2 = "World";
		String comma = ",";
		System.out.println(s1 + comma + space + s2 + "."); //Just like that, we made "Hello, World."
		
		char newLine = '\n';
		System.out.print("This starts on a new line because of the println above... ");
		System.out.print("but this doesn't because we didn't println before or use the newLine character.");
		System.out.print(newLine);
		System.out.print("See that this is on a new line!" + newLine);
		System.out.print("this is as well - chars can be added to strings (but subtraction doesn't work)!");
	}
}
