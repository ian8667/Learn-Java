// Copyright (c) 2002 MyHouse
//package ian;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.io.IOException;
import java.nio.charset.Charset;

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
 * JDK 17 Documentation
 * https://docs.oracle.com/en/java/javase/17/
 *
 * Java SE Version 17 API docs
 * https://docs.oracle.com/en/java/javase/17/docs/api/index.html
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
 * Modern file input/output with Java: Let’s get practical
 * https://blogs.oracle.com/javamagazine/post/java-path-nio2-directory-extensions-zip
 *
 * @author Ian Molloy April 2001
 * @version (#)coreJava.java        4.17 2022-02-11T23:57:53
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
// Consumer example 1
Consumer<Path> printit = new Consumer<Path>() {
    @Override
    public void accept(Path dd) {

      //dd = dd.toUpperCase();
      System.out.println(dd);

    }

}; //end printit
// Consumer example 2
Consumer<Path> konsumer = (str) -> System.out.println(str);

// List the files in this directory
Path myfile = Path.of("C:\\Gash\\ian.ian");
Charset myascii = Charset.forName("US-ASCII");

    try {

String cont = Files.readString(myfile, myascii);
System.out.println(cont);
// In my simple test, the length of the string was the same
// length of the file size (in bytes).
System.out.printf("String %s has length %d%n", "cont", cont.length());

    } catch (IOException e1) {
      System.err.println("IO problem of some kind");
      e1.printStackTrace();
    } //end try/catch block


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
