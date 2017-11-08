package helloWorldVariations;

public class HelloWorldMethods {
	//we just covered arrays, now we will cover methods.
	//use methods when you want to run the same bit of code over and over again without retyping it.
	
	//main method runs first, everything else must be called from it (or by other methods in it...).
	public static void main(String[] args) {
		/*
		 * methods work kinda like variables. They have types, like variables, and they can be
		 * sent as a parameter (also like variables, or the raw data they contain), but they differ
		 * from variables in that they usually change the data in some way.
		 */
		
		System.out.println(myMethod(5,10.2));
		System.out.println(myMethod(myMethod(5,10.2))); //this is passing the String 
														//from myMethod(int parameter1, double parameter2) as 
														//the parameter1 in myMethod(String parameter1). 
														//Complicated, right?
		System.out.println(myMethod('d'));
		
		
		int num = 5; //you can send variables to methods as parameters
		long fact = factorial(num); //Variables can store the outputs from methods of the same return type as that variable.
		System.out.println("the factorial of " + num + " is " + fact); //this is the same as 
		//System.out.println("the factorial of 5 is " + factorial(5)); 
		//but reads better, and has the added benefit of the creator only needing to change one number
		//num to change the output of that block of code.
		
		
		//See that the main method is a lot more concise now that we use methods, and has a flexibility that would be
		//impossible with only straight writing of software.
	}
	
	//methods return the same types as variables can be. Confusing? Practice!
	
	/**
	 * When you make a method, there are 5 things to consider. First, is the method public or private?
	 * Second, will the method be static? Non-static methods are only used in objects - more on those later.
	 * Third, what will the return type be? Void is acceptable here, it just means nothing comes back out. Don't forget
	 * the return statement for return types other than void!
	 * Fourth, what will my logical name for the method be? Remember to use camel case!
	 * Finally, what will the parameters for my method be? Parameters are the variables that go inside the parentheses.
	 * Remember that parameters are separated by commas, where pretty much everything else is separated by semicolons.
	 * 
	 */
	private static String myMethod(int parameter1, double parameter2) {
		return "parameter 1 is " + parameter1 + " and parameter 2 is " + parameter2;
	}
	
	/**
	 * Methods can be overridden - that means that two or more methods share a name but have different parameters.
	 * Don't forget to follow your steps when writing methods! (the return type can be different between overridden
	 * methods, but does not make a method overridden. There must be a different number or type of parameters.
	 */
	private static String myMethod(String parameter1) {
		return "the only parameter is: " + parameter1;
	}
	
	/**
	 * These fancy /** comments are javadocs - they show up blue instead of the regular green
	 * comments denoted by /* or //. When you hover over a method with the fancy blue comments immediately
	 * above it, the text in the fancy blue comment shows up in the yellow box. Very useful for describing what a method
	 * does without forcing you to search through dozens of classes and hundreds of lines of code to figure out what that
	 * method actually does.
	 */
	private static String myMethod(char parameter1) {
		return "the parameter is the character " + parameter1;
	}
	
	/**
	 * Remember loops? There's another way to loop in code: recursion. Recursion is when one method calls itself,
	 * creating a type of loop. A really easy thing to do recursion with is factorial math. Factorials are defined
	 * as number n factorial = n! = n(n-1)(n-2)(n-3)...(1). This could be implemented in a loop, but is less typing
	 * (albeit a lot more thinking) in recursion.
	 * Note that to make a parameter in blue text, type "@param".
	 * 
	 * @param int number
	 * @return the factorial of the parameter (number!). Longs are like ints, but have a much larger max value.
	 */
	private static long factorial(int number) {
		if(number > 1)
			return number * factorial(number - 1);
		return 1;
	}
	
	
	/*
	 * Challenge! Try to make a method to round doubles into ints! good luck!
	 */
	/**
	 * By adding 0.5 to a decimal number then truncating it, you effectively round the number. For example,
	 * 0.25 would round to 0... .25 + .5 = .75; 0.75 truncated is 0.
	 * Example 2: 1.6 would round to 2... 1.6 + 0.5 = 2.1; 2.1 truncated is 2. Rounding!
	 * @param numToRound
	 * @return numToRound rounded to the nearest int.
	 */
	private static int round(double numToRound) {
		return (int) (numToRound + .5);
	}
	
	/*
	 * Double challenge! Sort any given int array. Good luck!
	 */
	
	private static int[] sorter(int[] arrToSort) {
		
		for(int i = 0; i < arrToSort.length; i ++) {

			for(int j = i; j < arrToSort.length; j ++) {
				
				if(arrToSort[i] < arrToSort[j]) {
					int temp = arrToSort[j];
					arrToSort[j] = arrToSort[i];
					arrToSort[i] = temp;
				}
			}
		}
		
		return arrToSort;
	}
	
	/**
	 * This is a method to generate an array of random numbers that range from 0 to the size of the array minus 1,
	 * using the {@link Math.random} random number generator.
	 * 
	 * @param size
	 * @return a randomly filled array of length size
	 */
	private static int[] scrambler(int size) {
		int[] randomList = new int[size];
		for(int i = 0; i < size; i ++) {
			randomList[i] = (int)(Math.random() * size);
		}
		
		return randomList;
	}
}
