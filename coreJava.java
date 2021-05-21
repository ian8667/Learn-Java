// Copyright (c) 2002 MyHouse
//package ian;
//import java.time.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.io.IOException;
import java.math.BigInteger;

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
 * Documentation
 *
 * JDK 16 Documentation
 * https://docs.oracle.com/en/java/javase/16/
 *
 * Java Version 16 API docs
 * https://docs.oracle.com/en/java/javase/16/docs/api/index.html
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
 * @version (#)coreJava.java        4.09 2021-05-15T16:18:37
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

//https://www.programcreek.com/java-api-examples/?api=java.security.DigestInputStream
MessageDigest md = null;
try {
    md = MessageDigest.getInstance("MD5");
} catch (NoSuchAlgorithmException e1) {
    e1.printStackTrace();
}

byte[] databuffer = new byte[1024 * 8];
final String inputfile = "C:\\Gash\\ian.ian";
System.out.printf("Hashing file %s%n", inputfile);
int loopPasses = 0;
final int EOF = -1;
try (InputStream istream = new FileInputStream(inputfile);
     DigestInputStream dis = new DigestInputStream(istream, md)) {

    dis.on(true);
    while (dis.read(databuffer) != EOF) {
    	//Although this seems like an empty loop, the work is
      //actually being done in the 'condition' of the loop.
      //The action of reading bytes into the array updates
      //the message digest. The whole input stream is read
      //into the array. buffer by buffer. until the end of
      //stream (EOF) is reached.
      loopPasses++;
    }


//Part one
byte[] rawbuffer = md.digest();
System.out.println("trying to show the result with BigInteger");
BigInteger bigInt = new BigInteger(1, rawbuffer);
StringBuilder sb = new StringBuilder(bigInt.toString(16).toUpperCase());
while (sb.length() < 32 ) {
    //ensure the digest really is 32 bytes in length
    sb.insert(0, '0');
}
System.out.printf("StringBuilder(1) is now: %s%n", sb.toString());


//Part two
// Iterating through each byte in the array
System.out.println("looping through the buffer array");
StringBuilder sb2 = new StringBuilder(32);
for (byte i : rawbuffer) {
    sb2.append(String.format("%02X", i));
}
while (sb2.length() < 32 ) {
    //ensure the digest really is 32 bytes in length
    sb2.insert(0, '0');
}
System.out.println("");
System.out.printf("StringBuilder(2) is now: %s%n", sb2.toString());
System.out.printf("loopPasses is now: %s%n", loopPasses);


     } catch (IOException e1) {
    e1.printStackTrace();

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
