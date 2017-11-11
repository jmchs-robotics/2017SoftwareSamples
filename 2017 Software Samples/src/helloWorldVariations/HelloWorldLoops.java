package helloWorldVariations;

public class HelloWorldLoops { //and Booleans
	//loops are ways of doing something over and over again. As a general rule, loops run while the criteria
	//is true, and end once the criteria is false. Where the criteria is tested changes depending on the type
	//of loop, and can even vary from loop to loop.
	//The types of loops are while, do...while, for, and for each
	//Typically, the variables used as loop counters are i, j, and k in that order (i for index).
	//while and for loops test the criteria at the beginning, and do..while loops test the criteria at the end.
	//for each loops are a bit special - they perform the code between the curly braces once for each element in
	//an array.
	//Boolean operators are used to tell an array when to stop as well as being used in if statements!
	//They are > (Greater than), < (Less than), == (Absolutely equal to - don't compare doubles with this one),
	// ! (Not - inverts true to false and vice versa), != (Not equal to), >= (greater than or equal to), <= (Less than or equal
	// to). All boolean operators are read left to right, e.g. x < y is testing if x is less than y.
	//All boolean operators return (are computed to be) either True or False, even if they start with numbers.
	
	public static void main(String...strings) {
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(); //line break to make reading the output easy
		
		do {
			System.out.println(i);
			i--;
		}while (i >= 0);
		
		System.out.println(); //line break to make reading the output easy
		
		for(i = 0; i < 10; i ++) { //the ++ in the for loop parameters means "increment by one". Similarly, -- is decrement by one.
			System.out.println((char)(i + 64)); //this is a good example of casting making outputs weird.
		}
		
		System.out.println(); //line break to make reading the output easy
		
		char[] chars = { //this is how you declare a static array - notice that every element (the things separated by commas)
				'a',		 //is defined before you use the array. Other arrays can just be defined as type[] arr; then when you
				'B',		 //want to put data into it say arr = new type[n] where n is the number of element you want to save.
				'D',		 //Arrays can throw fits if you aren't careful... Arrays count their elements from 0 - so loops should too.
				'c',       //If you have an array of length 10, there are 10 elements in the array, but the largest index of an element
				'g',       //is 9. REMEMBER THIS! Otherwise you will get ArrayOutOfBounds Exception and have to debug your program.
				'a',
				'a',
				'a',
				'k',
				'Z' //Notice that each element is like a char variable all to itself, independent of the other elements.
		};
		
		for(char c : chars) {
			System.out.println(c);
		}
		
		//Boolean operators can be used in more than just loops. If statements are among the most useful in software,
		//and they run solely because booleans exist. They are in the format:
		/*
		 * if(boolean expression is true){
		 * then do this
		 * }else{
		 * do this
		 * }
		 */
		//if statements do not need the else, and they can be chained; e.g.
		/*
		 * if(boolean expression is true){
		 * then do this
		 * }else if(second boolean expression is true){
		 * then do this
		 * }else{
		 * do this
		 * }
		 */
		//There is one more place booleans may be used for our purposes, and that is Case..break statements.
		//They are in the form
		/*
		 * switch (var){
		 *  case 1:
		 *   do this
		 *   break;
		 *  case 2:
		 *   do this
		 *   break;
		 *  default
		 *   do this if no case is good
		 * }
		 */
		//Case break statements are used when you really need to define a lot of unique circumstances, instead of typing half
		//a million if else keywords with their own boolean expressions. However, case break only computes absolute equality.
		switch (i) {
		case 1:
			System.out.println("Hoodeedooda, i was equal to one");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Lol, i wasn't equal to any number we put in the case breaks!");
		}
		
		//case break statements are good for use with enums, which you will discover as you work with the robot code.
		
		//Arrays, as you glimpsed above, are good ways to store lots of unique values of the same type together.
		//They are usually manipulated through loops. For example, an array can make graphics:
		
		String[] happyFace = {
				"                                   ", //this is an "element" in the array happyFace
				"                                   ",
				"        -                –         ",
				"                                   ",
				" \\                               /",
				"  -_____________________________-",
		};
		
		for(String s : happyFace) {
			System.out.println(s); //this prints out the face easily, instead of four unique printlns, each with a line of the face.
		}
		
		//Or, we could make the array flexible, then define it to be a specific type of array later.
		
		String[] myFace;
		myFace = happyFace;
		
		for (i = 0; i < myFace.length; i ++) { //note that this is not i <= myFace.length - try it, and see what happens!
			System.out.println(myFace[i]); //here is how you reference a specific in an array.
		}
		
		//Note that system.out.println(type[] array) will print the resource location in the Java VM.
		//This means that passing arrays passes the memory location, and to print an array you need
		//a loop.
		System.out.println(myFace);
	}
}
