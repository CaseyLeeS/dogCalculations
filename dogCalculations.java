// Casey Sloan
// Made during Summer 2021 in my COP 2006 class to exemplify all of the skills that I've learned in my programming 1 course.
/* Data Type in Java: Primitive Data Types & Non-Primitive Data Types
  * 	Primitive Data Types: Boolean Type & Numeric Type
  * 	 	Boolean Type: boolean
  * 		Numeric Type: Character Value & Integral Value
  * 			Character Value: char
  *				Integral Value: Integer & Floating-Point
  * 				Integer: byte, short, int, & long
  * 				Floating-Point: float, & double
  * 	Non-Primitive Data Types: String, Array, etc.
  *  Source: https://www.geeksforgeeks.org/data-types-in-java/
 */
/* Define Variable
  * A Java "variable" is thought of as a storage for memory. It contains the data types (above) 
  * as to which offer different rules for input and output in order for your program to run properly.
  *  Source: Jenkov, J. (2018). Java Variables. Jenkov. http://tutorials.jenkov.com/java/variables.html#:%7E:text=A%20Java%20variable%20is%20a,needs%20to%20do%20its%20job.
 */
/* Define Scope
 *  Java's "scope" of a variable is the area of the program in which you can use this variable by name.
 *  Java's 3 types of Scope: Class Level Scope (Member Variables), Method Level Scope (Local Variables), & Block Scope (Loop Variables)
 *   Source: GeeksforGeeks. (2021, January 18). Scope of Variables In Java. https://www.geeksforgeeks.org/variable-scope-in-java/
 *   		 Scope in Java. (2021). Codecademy. https://www.codecademy.com/articles/variable-scope-in-java
 */

public class dogCalculations {

	public static void main(String[] args) {
		
		boolean boolYard = true;
		int intOutside = 5;
		final double dblKennel = 5.5;
		/* To declare a variable "final": what you are doing is making it's value unchangeable.
		 * Source: JFo 3–2: Numeric Data. (2021). ORACLE Academy. https://myacademy.oracle.com/lmt/clmsCourseDetails.prMain?in_sessionId=4A81313J538159J4&in_offeringId=71239041&in_from_module=LMTLOGIN.PRMENU
		 */
		String strMedFood = "200";
		short shtOutside = 4;


		intOutside = (int)shtOutside;
		/* Define Casting
		 * In Java, "casting" is used to change the size in memory that you want to use. Start with a double, it's to cut it off to change space.
		 * Source: Rachel Matthews. (2021, May 26).
		 */
		
		
		System.out.println("\tHello! Congratulations on your new bordercollie/shelty mix puppy/dog!");
		System.out.println("We just need some information from you to make sure you're new family member will be happy in his/her forever home <3");
		System.out.println("\nIs it " + boolYard + " that you have a yard for your new puppy/dog to get adequate amount of exercise in?");
		// 4 Future-> if no, ask "Is it true that you have the means to bring your dog to a dog park or other area of grass for your new puppy/dog to get the adequate amount of exercise in?"
		System.out.println("Will you be leaving your new puppy/dog in a kennel for any amount of time? \n\tIf yes, will it be for more than " + dblKennel + " hours per day?");
		System.out.println("Will you have the ability (& act in such way) as to take your new puppy/dog outside to use the restroom at least " + intOutside + " times per day?");
		System.out.println("Do you have a minum of $" + strMedFood + " set aside every month for your dogs necessary needs (ie. vet, medication, flea/tick prevention, "
				+ "food, toys, bed, etc)");

	}

}
