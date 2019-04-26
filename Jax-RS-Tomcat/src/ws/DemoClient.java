package ws;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class DemoClient 
{
	
	/*
	 * Webservice Client der den Webservice aufruft (hierzu wird die URL zusammengebaut) und
	 * danach die Rückgabe des Webservice einliest/weiterverarbeitet.	
	 * Aufruf: DemoClient.java > Run As > Java Application
	 */
   public static void main( String[] args )
   {
      Client client = ClientBuilder.newClient();
	   
	   String antwort = client.target("http://localhost:8080/Jax-RS-Tomcat/rest/demo/hello")
	           .request("text/plain")
	           .get(String.class);
	   
	   System.out.println( "\nAntwort vom Server:" );
	   System.out.println( antwort );
	   
	   client.close();
	   
   }
}
