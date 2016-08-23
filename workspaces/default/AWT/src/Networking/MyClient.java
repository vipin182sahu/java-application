 package Networking;
import java.io.*;
import java.net.*;

public class MyClient
{
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	
	MyClient()
	{
		try
		{
			s = new Socket("localhost",10);
			System.out.println(s);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			clientChat();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void clientChat()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		do
		{
			s = br.readLine();
			dout.writeUTF(s);
			dout.flush();
			System.out.println("Server MESSEGE "+din.readUTF());
		}while(!s.equals("stop"));
	}
	
	public static void main(String... s)
	{
		new MyClient();
	}
}