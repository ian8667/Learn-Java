// Copyright (c) 2002 MyHouse
//package ian;
import java.util.List;
import java.util.ArrayList;


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
 * @version (#)coreJava.java        4.31 2022-12-01T18:35:27
 */

/*
new work:
opening files with a characterset

StandardCharsets.US-ASCII
StandardCharsets.UTF-8
static Charset forName(String charsetName)
java.nio.charset.StandardCharsets
Charset charsetx = Charset.forName("US-ASCII");
LotteryDrawing var1 = new LotteryDrawing();
var1.getNumbers();
SecureRandom.getInstance("SHA1PRNG");

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

List<String> names = new ArrayList<String>();

names.add("Trims");
names.add("the");
names.add("capacity");
names.add("of");
names.add("this");
names.add("ArrayList");
names.add("instance");
names.add("to");
names.add("be");
names.add("the");
names.add("lists");
names.add("currentsize");

System.out.printf("the number of elements in this list: %d%n",names.size());

long counter = names.stream().filter((str) -> str.length() == 2).count();
System.out.printf("the number of elements with a length of two: %d%n", counter);


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
