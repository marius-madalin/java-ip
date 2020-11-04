package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import java.net.InetAddress;

/**
 * Unit test for simple App.
 */

class GetMyIPAddress
{
   public static void main(String args[]) throws Exception
   {
      /* public static InetAddress getLocalHost()
       * throws UnknownHostException: Returns the address 
       * of the local host. This is achieved by retrieving 
       * the name of the host from the system, then resolving 
       * that name into an InetAddress. Note: The resolved 
       * address may be cached for a short period of time.
       */
      InetAddress myIP=InetAddress.getLocalHost();
 
      /* public String getHostAddress(): Returns the IP 
       * address string in textual presentation.
       */
      System.out.println("My IP Address is:");
      System.out.println(myIP.getHostAddress());
  }
}