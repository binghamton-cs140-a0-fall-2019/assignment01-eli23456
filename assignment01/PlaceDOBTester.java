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

      DateAndPlaceOfBirth ex12 = new DateAndPlaceOfBirth(1990, 1, 1, "NYC", "NY", "USA");
      DateAndPlaceOfBirth ex32 = new DateAndPlaceOfBirth(1990, 1, 1, "LA", "CA", "USA");
      DateAndPlaceOfBirth ex22 = new DateAndPlaceOfBirth(1991, 1, 2, "Houston", "TX", "USA");
      DateAndPlaceOfBirth ex42 = new DateAndPlaceOfBirth(1992, 1, 3, "London", "UK");
      DateAndPlaceOfBirth ex52 = new DateAndPlaceOfBirth(1993, 1, 3, "Manchester", "Uk");
      output.println(ex12);
      output.println(ex22);
      output.println(ex32);
      output.println(ex42);
      output.println(ex52);
      output.println(ex1.hasSameBirthDateAs(ex22));
      output.println(ex1.hasSameBirthDateAs(ex32));
      output.println(ex1.hasSameBirthDayAs(ex22));
      output.println(ex4.hasSameBirthDayAs(ex52));
      output.println(ex1.youngerThan(ex32));
      output.println(ex3.youngerThan(ex12));
      output.println(ex4.olderThan(ex52));
      try(var output =new PrintWriter(new FileO
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
