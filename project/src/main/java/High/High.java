package high;

import java.io.IOException;
import java.net.ServerSocket;

public class High
{
	public static void main(String [] args) throws IOException {
		int port = Integer.parseInt(args[1]);
		ServerSocket serverSocket = new ServerSocket(port);
	}
}	

    