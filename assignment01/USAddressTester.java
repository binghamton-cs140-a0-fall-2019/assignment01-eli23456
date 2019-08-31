package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
  public static void main(String[] args) {
    StreetUSAddress ex1 = new StreetUSAddress("123 Front St", "", "Binghamton", "NY", "13905");
    StreetUSAddress ex2 = new StreetUSAddress("124 Front St", "AP 1B", "Binghamton", "NY", "13905");
    System.out.println(ex1);
    System.out.println(ex2);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
