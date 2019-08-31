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

      StreetUSAddress ex12 = new StreetUSAddress("123 Front St", "", "Binghamton", "NY", "13905");
      StreetUSAddress ex22 = new StreetUSAddress("124 Front St", "AP 1B", "Binghamton", "NY", "13905");
      output.println(ex12);
      output.println(ex22);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
