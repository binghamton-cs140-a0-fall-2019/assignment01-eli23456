package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
  	Computer computer1 = new Computer("Apple", "i7", 8, 1500, true, 2000);
    Computer computer2 = new Computer("Apple", "i7", 8, 1500, false, 2000);
    Computer computer3 = new Computer("Apple", "i7", 8, 500, true, 2000);
    Computer computer4 = new Computer("Apple", "i7", 8, 500, false, 2000);
    System.out.println(computer1);
    System.out.println(computer2);
    System.out.println(computer3);
    System.out.println(computer4);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
