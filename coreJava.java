// Copyright (c) 2002 MyHouse
//package ian;
//import java.time.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

/**
 * <p>A file to practice my Java as I go through the book
 * 'Core Java Volume 2 - Advanced Features'.</p>
 * <p><i>import</i> statements <b>must</b> go above this comment.</p>
 *
 * <p>Testing a Swing Look and Feel - see https://laffy.dev.java.net/</p>
 *
 * <p>Sets the frame to the centre of the screen:<br />
 *   <JFrame>.setLocationRelativeTo(null);</p>
 *
 * <p><pre>Another useful 'main' method.
 *   public static void main(String[] args) {
 *     gmt var1 = new gmt();
 *     //
 *     var1.getTimeInfo();
 *     System.out.println("\nEnd of run for gmt");
 *     System.exit(0);
 *   }//end of main</pre></p>
 *
 * <p>1 millisecond=0.001 second. ie 5000 milliseconds=5 seconds.</p>
 *
 * <p>javac -Xlint:all coreJava.java</p>
 *
 * <p>enum Season { WINTER, SPRING, SUMMER, FALL }<br />
 * http://java.sun.com/j2se/1.5.0/docs/guide/language/enums.html</p>
 *
 * <p>java -Xrunhprof:help<br />
 * HPROF: Heap and CPU Profiling Agent (JVMTI Demonstration Code)</p>
 *
 * <p>String outputEncoding = "US-ASCII";</p>
 *
 * <blockquote>
 * <pre>
 *    Some sample text as Sun Microsystems, Inc does it.
 * </pre>
 * </blockquote>
 * <p>
 *
 * Which one of these is best to use:
 * String result = String.format("%032x%n", new BigInteger(1, myBytes));
 * String md5Result = new BigInteger(1, md5.digest()).toString(16);
 *
 * JDK 15 Documentation
 * https://docs.oracle.com/en/java/javase/15/
 *
 * Java Version 15 API docs
 * https://docs.oracle.com/en/java/javase/15/docs/api/index.html
 *
 * Apache Hadoop Main 3.3.0 API
 * https://hadoop.apache.org/docs/current/api/
 *
 * @author Ian Molloy April 2001
 * @version (#)coreJava.java        3.96 2021-01-04T15:46:58
 */
public class coreJava {
private byte dummy;
  /**
   * Constructor
   */
  public coreJava() {
    this.dummy = 99;
    launchFrame();
  }//end of constructor

  /**
   * Working test method.
   * Floating point formatting to decimal places: %.2f
   * A format of %07d will pad, for example, a 7 to 007.
   * topLevel.setLocationRelativeTo(null);
   */
  public void launchFrame() {
    System.out.printf("Start of test on %tc%n", new java.util.Date());
    // ---------------------------------------------------------------
//Java Unzip File Example
//https://www.journaldev.com/960/java-unzip-file-example
//Zip Slip Vulnerability (?)
// See if we find the first Saturday after this date.
LocalDate tempDate = LocalDate.of(2021, Month.JANUARY, 03);
// This is the day of the week we're looking for
final DayOfWeek eow = DayOfWeek.SATURDAY;
DayOfWeek weekday;
byte loopCounter = 0;
System.out.printf("Start date is: %s%n", tempDate);

do {
    loopCounter++;
    tempDate = tempDate.plusDays(1);
System.out.printf("tempdate is now %s%n", tempDate);
    weekday = tempDate.getDayOfWeek();
} while (weekday.compareTo(eow) != 0);

System.out.println("");
System.out.printf("end of loop, loop counter is now %d%n", loopCounter);
System.out.printf("tempdate is now %s%n", tempDate);

    // ---------------------------------------------------------------
    System.out.printf("End of test on %tc%n", new java.util.Date());
  } //end of launchFrame

  /**
   * main
   * @param args
   */
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
       public void run() {
         new coreJava();
       }
    });
  } //end of main

} //end of class
