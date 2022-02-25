// Copyright (c) 2002 MyHouse
//package ian;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

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
 * @version (#)coreJava.java        4.20 2022-02-25T15:57:26
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
Consumer<String> printit = new Consumer<String>() {
    @Override
    public void accept(String dd) {

      //dd = dd.toUpperCase();
      System.out.println(dd);

    }

}; //end printit
// Consumer example 2
Consumer<String> konsumer = (str) -> System.out.println(str);

final String BASEPATH = "C:\\Gash";
final Path myfile1 = Path.of(BASEPATH, "gashinput.txt");
final Path myfile2 = Path.of(BASEPATH, "gashinput002.txt");
Charset myascii = Charset.forName("US-ASCII");

String msg = "hello world";
konsumer.accept(msg);

msg = "trying to copy files";
printit.accept(msg);


try (FileChannel inchan = new FileInputStream(myfile1.toString()).getChannel();
     FileChannel outchan = new FileOutputStream(myfile2.toString()).getChannel() )
{
  // The position within the file at which the transfer is to begin.
  // This variable is also the number of bytes, possibly zero, that
  // were actually transferred. So we use this variable to help us
  // step (move) through the channel transferring bytes as we go along
  long filepos = 0L;

  // The maximum number of bytes to be transferred. I don't know
  // how to calculate the optimum buffer size so this is just a
  // guess
  final long buffersize = (1024 * 8);

  // Input channel size. We could also use "Files.size(path_to_object)"
  final long filesize = inchan.size();

  while (filepos < filesize) {
      filepos += inchan.transferTo(filepos, buffersize, outchan);
  }

} catch (IOException e) {
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
