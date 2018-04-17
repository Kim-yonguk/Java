package UDP_Program;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		DatagramSocket socket=null;
		System.out.println("송수신 하려는 포트 입력: ");
		int input=Integer.valueOf(new Scanner(System.in).nextLine());
		
		Test1 open=new Test1();
		open.port=input;
		Thread t=new Thread(open);
		t.setPriority(10);
		t.start();
		
		while(true) {
			try {
				socket=new DatagramSocket();
				System.out.println("<<메시지 전달>>");
				String s= new Scanner(System.in).nextLine();
				byte[] buf=s.getBytes();
				InetAddress address=InetAddress.getByName("127.0.0.1");
				DatagramPacket packet=new DatagramPacket(buf, buf.length,address,input);
				socket.send(packet);
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Test1 implements Runnable{
	DatagramSocket socket = null;
	int port;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			socket=new DatagramSocket(port);
			
			while(true) {
				byte[] buf=new byte[256];
				DatagramPacket packet=new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				System.out.println("<<<메시지 도착>>>\n"+new String(buf));
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		socket.close();
	}
}
