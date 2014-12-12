import org.apache.xmlrpc.*;
import org.apache.xmlrpc.sebserver.*;
import org.apache.xmlrpc.XmlRpcServer;

public class JavaServer { 

	 public Integer sum(int x, int y) {
		return new Integer(x+y);
	 }

	 public static void main (String [] args) {
		int port= 80;
		try {
			WebServer webServer = new WebServer(port);
			XmlRpcServerConfigImpl config = new XmlRpcServerConfigImpl();
			XmlRpcServer server = webServer.getXmlRpcServer();
			server.setConfig(config);
			server.setHandlerMapping(mapping);
			webServer.start();
			System.out.println("Started successfully.");
			System.out.println("Accepting requests. (Halt program to stop.)");
		} catch (Exception exception) {
			 System.err.println("JavaServer: " + exception);
		}
	}
 }