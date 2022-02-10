// Copyright (c) 2002 MyHouse
//package ian;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.io.IOException;

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
 * Modern file input/output with Java: Let�s get practical
 * https://blogs.oracle.com/javamagazine/post/java-path-nio2-directory-extensions-zip
 *
 * @author Ian Molloy April 2001
 * @version (#)coreJava.java        4.15 2022-02-10T17:53:05
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
Consumer<String> myConsumer = new Consumer<String>() {
    @Override
    public void accept(String line) {

    System.out.println(line);

    }

}; //end myConsumer

Consumer<String> konsumer = (str) -> System.out.println(str);
//konsumer.accept();
Path filename = Path.of("C:\\Gash\\ian.ian");
try (BufferedReader br = Files.newBufferedReader(filename);
     Stream<String> mystream = br.lines(); ) {

//mystream.forEach(System.out::println);
mystream.forEach(konsumer);
} catch (IOException e) {
  System.err.println("IO type error");
  e.printStackTrace();
}

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
