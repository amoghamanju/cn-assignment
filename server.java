import java.net.*;   
import java.util.Scanner; 
public class server{   
   public static void main(String[] args) throws Exception {   
     
   String str = ""; 
   Scanner sc=new Scanner(System.in); 
	System.out.println("Enter n");
        int n=sc.nextInt();
        
        
        int a[]=new int[10];
        
        for(int  i=1;i<=n;i++)
        {
            a[i]=30000+(100*i)+6;
        }
        for(int  i=1;i<=n;i++)
        {
            System.out.println("\n ports ALLOWED a["+i+"]"+a[i]); ;
        }
        while(true){
        DatagramSocket ds = new DatagramSocket();     
        System.out.println("\n Enter the message : "); 
	str=sc.nextLine(); 
        
        InetAddress ip = InetAddress.getByName("127.0.0.1");   
          
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3009);
        ds.send(dp);   
        ds.close();   
        }
    }   
        
}  
