package segmentedfilesystem;
import java.io.*;
import java.net.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
      		System.out.println("You need to enter a hostname.");
      		return;
    	}	
	DatagramSocket socket = new DatagramSocket();
        byte[] buf = new byte[1028];
        InetAddress address = InetAddress.getByName(args[0]);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 6014);
        socket.send(packet);

	List<byte[]> headers = new ArrayList<byte[]>();
        List<byte[]> data = new ArrayList<byte[]>();
        List<byte[]> file0 = new ArrayList<byte[]>();
        

  
    }

}
