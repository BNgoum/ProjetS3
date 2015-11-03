import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] zero) {
		
		
		Socket socket;
		BufferedReader in;
		PrintWriter out;

		try {
		
			socket = new Socket(InetAddress.getLocalHost(),2008);	
		        System.out.println("Demande de connexion");

		        in = new BufferedReader (new InputStreamReader (socket.getInputStream())); //Recupérer le flux sortant
		        String message_distant = in.readLine(); // readLine() permet de lire une chaîne de caractère
		        System.out.println(message_distant);
		        
		        socket.close();
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
