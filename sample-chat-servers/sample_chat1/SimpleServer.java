import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer implements Runnable {

   
   private ServerSocket s;

   
   private int port;

   public SimpleServer(int p) throws Exception {

      
      s = new ServerSocket(port = p);
   }

   public class RequestHandler implements Runnable {
      private Socket sock;

      private RequestHandler(java.net.Socket x) {
         sock = x;
      }

      public void run() {
         try {
            System.out.println("connect...");
            int c;

            
            
            while((c = sock.getInputStream().read()) != -1) {
                if(c >= 97 && c <= 122) {
                  c -= 32;
                } else if (c >= 65 && c <=90) {
                  c += 32;
                }
                
                sock.getOutputStream().write(c);
                
                if (sock.getInputStream().available() == 0) {
                   sock.getOutputStream().flush();
                }
            }
            sock.getOutputStream().flush();
            sock.close();
            System.out.println("disconnect...");
         } catch (Exception e) {
            System.out.println("HANDLER: " + e);
         }
      } 
   }

   public void run() {
      while(true) {
         try {
            
            new Thread(new RequestHandler(s.accept())).run();
         } catch(Exception e) {
            System.out.println("SERVER: " + e);
         }
      }
   } 


  public static void main(String[] argv) throws Exception {
     if (argv.length != 1) {
        System.out.println("java SimpleServer <port>");
        System.exit(1);
     }
     new SimpleServer(Integer.parseInt(argv[0])).run();
  }
   

}
