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

      DateAndPlaceOfBirth placeDob2 = new DateAndPlaceOfBirth(2000, 4, 11, "NYC", "NY", "USA");
      StreetUSAddress address2 = new StreetUSAddress("110 Random St", "NYC", "NY", "11415");
      Person aPerson2 = new Person("Elisha", "Aghajani", "123456789", placeDob2, address2;
      output.println(aPerson2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
