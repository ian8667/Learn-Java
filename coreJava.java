// Copyright (c) 2002 MyHouse
//package ian;
//import java.time.*;
import java.net.Socket;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.InputStreamReader;

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
 * @version (#)coreJava.java        4.01 2021-02-08T00:33:46
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

// Daytime Protocol (RFC-867) nist
// https://www.nist.gov/pml/time-and-frequency-division/time-distribution/internet-time-service-its#:~:text=The%20NIST%20servers%20listen%20for,a%20resolution%20of%20200%20ps.

//From: Trevor Milburn <trevorjmilburn@hotmail.co.uk>
/*
Do some uuid work
A Universally Unique IDentifier (UUID) URN Namespace
https://tools.ietf.org/html/rfc4122

See also:
Generate a UUID compliant with RFC 4122
https://www.cryptosys.net/pki/uuid-rfc4122.html
https://betterexplained.com/articles/the-quick-guide-to-guids/

import java.util.UUID;
UUID myuid = UUID.randomUUID();

MessageDigest salt = MessageDigest.getInstance("SHA-256");
salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
String digest = bytesToHex(salt.digest());
*/


//Convert this to PowerShell
Charset ascii = Charset.forName("US-ASCII");
//String hostname = "3.se.pool.ntp.org";
String hostname = "time.nist.gov";
int port = 13;
int byteRead = 0;

try (Socket mysocket = new Socket(hostname, port);
     InputStreamReader reader = new InputStreamReader(mysocket.getInputStream(),ascii);)
{
// Make sure we don't query the time server too often.
System.out.println("Sleeping for 5 seconds");
Thread.sleep(5000);


System.out.printf("Trying to get Timestamp\n");
byteRead = reader.read();
while (byteRead != -1) {
    System.out.print((char)byteRead);
    byteRead = reader.read();

} //end while loop

} catch (IOException e) {
         e.printStackTrace();
} catch (InterruptedException e2) {
      System.err.println("sleep Thread is interrupted");
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
