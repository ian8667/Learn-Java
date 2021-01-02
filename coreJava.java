// Copyright (c) 2002 MyHouse
//package ian;
//import java.time.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Consumer;

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
 * @version (#)coreJava.java        3.95 2021-01-02T12:51:38
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

Consumer<LocalDate> konsumer = (s) -> System.out.println(s);

//DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd LLLL u");
LocalDate startdate = LocalDate.of(2020, 12, 5);
LocalDate enddate = LocalDate.of(2020, 12, 31);
Period periodStep = Period.of(0,0,7); //step in chunks of 7 days
System.out.println("Approach #1");

List<LocalDate> listOfDates = startdate
                              .datesUntil(enddate, periodStep)
                              .collect(Collectors.toList());
listOfDates.forEach((s) -> System.out.println(s));

System.out.println("");
System.out.println("Approach #2");
startdate.datesUntil(enddate, periodStep)
         .forEach((s) -> System.out.println(s));


System.out.println("");
System.out.println("Approach #3");
startdate.datesUntil(enddate, periodStep)
         .forEach((w) -> konsumer.accept(w));
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
