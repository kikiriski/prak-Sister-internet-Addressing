package modul1;

import java.net.InetAddress;

public class inAddress {
     public static void main(String[] args) {
         try {
             System.out.println("# get hostname from current ip");
             String ip="173.252.120.6";
             System.out.println("Hostname from ip \""+ip+"\":"+InetAddress.getByName(ip).getHostName());
             
             System.out.println("# get host address from current name");
             String host="www.google.com";
             System.out.println("Host/IP: "+InetAddress.getByName(host).getHostAddress());
             System.out.println("host/ip : "+InetAddress.getByName(host));
             
             System.out.println("\n# Check connnection");
             InetAddress ia=InetAddress.getByName(host);
             if (ia.isReachable(3000)) {
                 System.out.println(ia+" is reachable");
             }else{
             System.out.println(ia+"is unreachable");
             }

      
         } catch (Exception ex) {
             System.out.println(ex);
         }

    }


}
