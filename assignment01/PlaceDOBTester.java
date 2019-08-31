package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth ex1 = new DateAndPlaceOfBirth(1990, 1, 1, "NYC", "NY", "USA");
    DateAndPlaceOfBirth ex3 = new DateAndPlaceOfBirth(1990, 1, 1, "LA", "CA", "USA");
    DateAndPlaceOfBirth ex2 = new DateAndPlaceOfBirth(1991, 1, 2, "Houston", "TX", "USA");
    DateAndPlaceOfBirth ex4 = new DateAndPlaceOfBirth(1992, 1, 3, "London", "UK");
    DateAndPlaceOfBirth ex5 = new DateAndPlaceOfBirth(1993, 1, 3, "Manchester", "Uk");
    System.out.println(ex1);
    System.out.println(ex2);
    System.out.println(ex3);
    System.out.println(ex4);
    System.out.println(ex5);
    System.out.println(ex1.hasSameBirthDateAs(ex2));
    System.out.println(ex1.hasSameBirthDateAs(ex3));
    System.out.println(ex1.hasSameBirthDayAs(ex2));
    System.out.println(ex4.hasSameBirthDayAs(ex5));
    System.out.println(ex1.youngerThan(ex3));
    System.out.println(ex3.youngerThan(ex1));
    System.out.println(ex4.olderThan(ex5));
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
