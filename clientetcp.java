import java.net.*;
import java.io.*;
public class clientetcp {
 public static void main(String argv[]) {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
Socket socket;
String mensaje="";
try {
socket = new Socket("127.0.0.1",6000);
DataOutputStream out = new DataOutputStream(socket.getOutputStream());
 do {
 mensaje = in.readLine();
 out.writeUTF(mensaje);
 } while (!mensaje.startsWith("fin"));
 }
 catch (Exception e) {
 System.err.println(e.getMessage());
 System.exit(1);
 }
 }
}