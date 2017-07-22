import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer170701001 {

	public static void main(String[] args) {
		try(
			ServerSocket server = new ServerSocket(4444);
			Socket socket = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				) {
					String line = null;
					StringBuffer sb = new StringBuffer();
					while((line = reader.readLine()) != null) {
						sb.append(line + "\n");
					}
					System.out.println(sb);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
