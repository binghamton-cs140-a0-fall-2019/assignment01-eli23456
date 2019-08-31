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

      SimpleDate ex12 = SimpleDate.of(2000, 1, 1);
      SimpleDate ex22 = SimpleDate.of(2000, 1, 2);
      SimpleDate ex32 = SimpleDate.of(2000, 1, 3);
      output.println(ex22.before(ex12);)
      output.println(ex22.before(ex32);)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
