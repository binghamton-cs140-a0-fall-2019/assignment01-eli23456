package assignment01;
/**
 * Class to store information about a personal computer with the
 * basic information stored in an advertisement for a computer.
 *
 * @author CS 140
 *
 */
 public class SimpleDate {
   private int year;
   private int month;
   private int day;

   public static SimpleDate of(int yr, int m, int d) {
     var returnValue = new SimpleDate();
     returnValue.year = yr;
     returnValue.month = m;
     returnValue.day = d;
   }
   public boolean before(SimpleDate other) {
     return true;
   }
 }
