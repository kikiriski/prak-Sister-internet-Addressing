package modul1;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class LocalHostDemo {
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        System.out.println("Looking up localhost");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("name : "+localAddress.getHostName());
    }

}
