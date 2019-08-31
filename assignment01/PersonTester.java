package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth placeDob = new DateAndPlaceOfBirth(2000, 4, 11, "NYC", "NY", "USA");
    StreetUSAddress address = new StreetUSAddress("110 Random St", "NYC", "NY", "11415");
    Person aPerson = new Person("Elisha", "Aghajani", "123456789", placeDob, address);
    System.out.println(aPerson);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
