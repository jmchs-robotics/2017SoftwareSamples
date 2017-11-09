package wordScramblerObjectSample;

//this is a simple runner class that is an example of what is at the core of every Java project. 
//Chances are, you will never see the main method if you inherit a project or work from robotBuilder. 
//Don't stress it, just learn the order of execution of events in the software you are creating and work
//from there.
public class ScramblerRunner {
	public static void main(String...strings ) {
		//see all the code we saved ourselves from writing?!
		Scrambler s = new Scrambler("My fancy string");
		
		s.print();
		
		Scrambler c = new Scrambler("I am so glad I didn't have to write all that code so many times!");
		
		c.print();
		
		Scrambler[] scramArr = { //An array of Scrambler objects, each of which contains an unscrambled and scrambled String.
				new Scrambler("method"),
				new Scrambler("variable"),
				new Scrambler("loop"),
				new Scrambler(),
				new Scrambler("object")
		};
		
		for(Scrambler scram : scramArr) { //note that each time this loop runs, scram "adopts" a different object from the array.s
			scram.print();
		}
		
		//Like arrays, printing an object directly prints the memory location of the object. Not too useful...
		System.out.println(s);
		
		
		System.out.println();
		//since the scramble method is static and public, it can be called from outside the scramble objects
		//through the class hierarchy. These are like how the Math.___ methods can be invoked without Math objects
		System.out.println(Scrambler.scramble("This is a static method invoked without creating an object!"));
	}
}
