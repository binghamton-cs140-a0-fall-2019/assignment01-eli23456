package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
  public static void main(String[] args) {
    SimpleDate ex1 = SimpleDate.of(2000, 1, 1);
    SimpleDate ex2 = SimpleDate.of(2000, 1, 2);
    SimpleDate ex3 = SimpleDate.of(2000, 1, 3);
    System.out.println(ex2.before(ex1);)
    System.out.println(ex2.before(ex3);)
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
