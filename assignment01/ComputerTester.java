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

      Computer computer12 = new Computer("Apple", "i7", 8, 1500, true, 2000);
      Computer computer22 = new Computer("Apple", "i7", 8, 1500, false, 2000);
      Computer computer32 = new Computer("Apple", "i7", 8, 500, true, 2000);
      Computer computer42 = new Computer("Apple", "i7", 8, 500, false, 2000);
      output.println(computer12);
      output.println(computer22);
      output.println(computer32);
      output.println(computer42);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
