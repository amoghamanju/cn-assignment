    import java.net.*;   
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    public class assignment{   
      public static void main(String[] args) throws Exception {  
        while(true){
        DatagramSocket ds = new DatagramSocket(3009);   
        byte[] buf = new byte[1024];   
        DatagramPacket dp = new DatagramPacket(buf, 1024);   
        ds.receive(dp);   
        String str = new String(dp.getData(), 0, dp.getLength()); 
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
         LocalDateTime now = LocalDateTime.now();  
        System.out.println(str+"."+ds.getLocalPort()+"     "+dtf.format(now));   
        ds.close(); 
        }
      }   
    }  
