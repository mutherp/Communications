
import java.io.*;
import java.net.*;

public class TcpListener
{
	public static void main(String[] args)
	{
		ServerSocket sock = null;
		String info = "";
		DataInputStream incomingData = null;
		
		Socket clientSoc = null;
		
		try
		{
			sock = new ServerSocket(9090);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		try
		{
			clientSoc = sock.accept();
			incomingData = new DataInputStream(clientSoc.getInputStream());
			if(incomingData!=null)
			{
				while (true)
				{
					info = incomingData.readLine();
					if(info==null)
					{
						return;
					}
					System.out.println(info);
				}
			}
			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		
	}
	
	
}
