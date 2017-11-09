package wordScramblerObjectSample;

/*
 * This here is your first object. Objects are pretty cool things in software - so cool, that an entire style of programming
 * (OOP, or Object Oriented Programming) is named after them. They act like a custom variable type - you can make object
 * arrays, and as many vars of your object type as you want, but objects are more than just fancy variables.
 * Objects can contain methods like any class, and can be called through the . tree.
 * When you declare an object, each will operate separately (unless you do static) but still be able to do the same operations.
 * Objects are like enemies in a game - there may be two, or three, but they all do essentially the same thing. The Pac Man ghosts
 * are a good example of this - they exit the box at different times, and have different colors, but execute essentially the same
 * methods. If methods allow you to run the same bit of code over and over again, objects let you run methods over and over again
 * and store unique information without a mess of global and local variables.
 */
public class Scrambler {

	//the first thing in any object is the variable declarations. These aren't static, nor are they public; you will only see
	//this type of variable in objects.
	
	String unscrambled;
	String scrambled;
	
	//The second thing in any object is the constructor(s). Constructor(s) are how objects are declared, and they always share
	//the same name as the class. So, a Scrambler constructor is Scrambler(){}.
	
	/**
	 * Initializes the default object, with the unscrambled string "You used the default constructor".
	 */
	Scrambler(){
		super(); //you don't need to know what this does, only that it is good to include it. It won't kill you to not, however...
		
		//Constructors are generally used to give values to the variables inside each object. However, in the Default Constructor,
		//a constructor with no parameters, we can't get what the user wants to set the object variables to. We can abstain from
		//using the default constructor, or we can make default values inside it, but alway smake sure your code tells the next
		//people who come to read it what the intention is.
		
		unscrambled = "You used the default constructor";
		scrambled = this.scramble(unscrambled); //use this to tell the program that you are using a method from this object.
	}
	
	/**
	 * Construct the object with a word of your choice. Automatically scrambles it for use in printing or manipulating further.
	 * @param word
	 */
	Scrambler(String word){
		super();
		
		//this is an example of a constructor that takes an argument. Guess what we do with that argument! We put it into the
		//appropriate variable.
		
		unscrambled = word;
		scrambled = this.scramble(unscrambled); //note that this line is the same as in the default constructor.
	}
	
	/**
	 * Constructor for encoding words. With a ShiftCode type, the offset defines how many alphabet slots to
	 * shift each letter right. With decode type, the offset defines how many alphabet slots to shift each
	 * letter left. 
	 * @param type
	 * @param scrambledWord
	 * @param offset
	 */
	Scrambler(ScrambleType type, String word, int offset){
		switch(type) {
		case Random:
			unscrambled = word;
			scrambled = scramble(unscrambled);
			break;
		case Decode:
			scrambled = word;
			unscrambled = encode(-offset,scrambled);
			break;
		case ShiftCode:
			unscrambled = word;
			scrambled = encode(offset,scrambled);
		}
	}
	
	static public String scramble(String word) {
		char[] scramble = word.toCharArray(); //make a char array because they are easy to work with.
		
		for(int i = 0; i < scramble.length/2 + 1; i ++) {
			//set a int that maps a first half character to the second half of the word.
			int newIndex = (int)(Math.random() * (scramble.length / 2) + scramble.length / 2);
			
			char temp = scramble[newIndex]; //do a swap
			scramble[newIndex] = scramble[i];
			scramble[i] = temp;
		}
		
		return new String(scramble); //Since Strings are objects, they were created to accept char[] in a constructor and make it a string!
	}
	
	private String encode(int offset, String word) { //shift each character by the offset. Can encode or decode letter-shifting problems.
		char[] encoded = word.toCharArray();
		
		for(int i = 0; i < encoded.length; i ++) {
			encoded[i] += offset; //remember that you can add ints to chars? Here's your chance to see it in action!
		}
		
		return new String(encoded);
	}
	
	/**
	 * Returns a String that contains all the important info about the variables in this object in an easily
	 * readable form.
	 * @return
	 */
	private String turnToString() {
		return "word: " + unscrambled + "\nscrambled word: " + scrambled;
	}
	
	/**
	 * Uses the private {@link turnToString} method to quickly print the string without requiring more typing in the running code.
	 * Fun, right?
	 */
	public void print() {
		System.out.println(this.turnToString() + '\n');
	}
	
	//getters and setters are easy ways to get and set object variables. They are usually part of housekeeping your objects
	
	public String getUnscrambled() {
		return unscrambled;
	}
	
	public String getScrambled() {
		return scrambled;
	}
	
	//In this case we don't use setters because creating a new object would be easier.
}
