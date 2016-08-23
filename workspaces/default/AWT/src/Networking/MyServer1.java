package Networking;
import java.io.*;
import java.net.*;
public class MyServer1 {
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	public MyServer1(){
		try{
			System.out.println("server started");
			ss = new ServerSocket(10);
			s = ss.accept();
			System.out.println("Client canceled");
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			serverChat();
		}catch(Exception e){}
	}
	public static void main(String[] ss){
		new MyServer();
	}
	public void serverChat()throws IOException{
		String str,s1;
		do{
			str = dis.readUTF();
			System.out.println("Clint connected "+str);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s1 = br.readLine();
			dos.writeUTF("hello"+str);
			dos.flush();
		}while(!str.equals("stop"));
	}
}
