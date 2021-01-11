// Copyright (c) 2002 MyHouse
//package ian;
//import java.time.*;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
 * Documentation
 *
 * JDK 15 Documentation
 * https://docs.oracle.com/en/java/javase/15/
 *
 * Java Version 15 API docs
 * https://docs.oracle.com/en/java/javase/15/docs/api/index.html
 *
 * The Java Tutorials
 * https://docs.oracle.com/javase/tutorial/
 *
 * Apache Hadoop Main 3.3.0 API
 * https://hadoop.apache.org/docs/current/api/
 *
 * Learning
 *
 * Java 8 Stream Tutorial
 * https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *
 * @author Ian Molloy April 2001
 * @version (#)coreJava.java        4.00 2021-01-10T13:25:38
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
   * A format of %03d will pad, for example, a 7 to 007.
   * topLevel.setLocationRelativeTo(null);
   */
  public void launchFrame() {
    System.out.printf("Start of test on %tc%n", new java.util.Date());
    // ---------------------------------------------------------------
//Java Unzip File Example
//https://www.journaldev.com/960/java-unzip-file-example
//Zip Slip Vulnerability (?)

// Finding min and max number from a stream of numbers
List<Integer> numList = List.of(75,81,50,15,11,30,43,22);
Comparator<Integer> komparator = Comparator.comparing(Integer::intValue);

System.out.println("Sorted output");
numList.stream().sorted().forEach((w) -> System.out.println(w));
Optional<Integer> minNumber = numList.stream().min(komparator);
Optional<Integer> maxNumber = numList.stream().max(komparator);
minNumber.ifPresent(w -> System.out.printf("Min number: %d%n", w));
maxNumber.ifPresent(w -> System.out.printf("Max number: %d%n", w));

System.out.println("\nPart two");
int mySum = numList.stream().mapToInt(Integer::intValue).sum();
System.out.printf("The sum of all the numbers is: %d%n", mySum);
int sum99 = numList.stream().reduce(0, Integer::sum); //sums up numbers in the stream
System.out.printf("sum99 is now: %d%n", sum99);


numList.stream().reduce(Integer::min).ifPresent(w -> System.out.println(w));
numList.stream().reduce(Integer::max).ifPresent(w -> System.out.println(w));

System.out.println("\nCount of items in the list");
long kount = numList.stream().count();
System.out.printf("Number of items found: %d%n", kount);
System.out.printf("The old fashioned count: %d%n", numList.size());

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
