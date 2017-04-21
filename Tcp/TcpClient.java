
import java.io.*;
import java.net.*;

public class TcpClient
{
	public static void main(String[] args) throws Exception
	{
		String serverIp ="192.168.0.14"; 
		Socket sock = new Socket(serverIp,9090);
		PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
		
		//while(true)
		//{
			out.println("HELLO");
			sock.close();
		//}
	}	
}
