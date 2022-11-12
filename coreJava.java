// Copyright (c) 2002 MyHouse
//package ian;
import java.util.function.Consumer;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
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
 * String md5Result = String.format("%032x%n", new BigInteger(1, myBytes));
 * String md5Result = new BigInteger(1, md5.digest()).toString(16);
 *
 * Documentation:
 *
 * JDK 19 Documentation
 * https://docs.oracle.com/en/java/javase/19/
 *
 * Java SE Version 19 API docs
 * https://docs.oracle.com/en/java/javase/19/docs/api/index.html
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
 * Java Magazine:
 * Modern file input/output with Java Path API and Files helper methods
 * https://blogs.oracle.com/javamagazine/post/path-files-input-output
 * Modern file input/output with Java: Let's get practical
 * https://blogs.oracle.com/javamagazine/post/java-path-nio2-directory-extensions-zip
 *
 * Java Tutorial
 * https://www.w3schools.com/java/default.asp
 *
 * @author Ian Molloy April 2001
 * @version (#)coreJava.java        4.28 2022-11-12T13:09:34
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
// Consumer example 2
Consumer<String> konsumer = (str) -> System.out.println(str);

String msg = "hello world from Consumer<String> konsumer";
konsumer.accept(msg);

//The Health Lottery
//For each line, choose five numbers between 1 and 50.
//use java.security.SecureRandom as well?

/*
Section one
*/
System.out.println("ThreadLocalRandom - non stream");
final ThreadLocalRandom rannum = ThreadLocalRandom.current();
Set<Integer> myset = new LinkedHashSet<Integer>();
int nexti = 0;
int min = 1;
int max = 50;
int wanted = 5; //number of integers to draw
while (myset.size() < wanted) {
    nexti = rannum.nextInt(min, (max + 1));
    myset.add(nexti);
}
System.out.println("Random numbers with no duplicates = "+myset.toString());


/*
Section two
*/
System.out.println();
System.out.println("ThreadLocalRandom - with a stream");
IntStream istream = rannum.ints(min, (max + 1));
istream.distinct().limit(wanted).forEach(System.out::println);
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
