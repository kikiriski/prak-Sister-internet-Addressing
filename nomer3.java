package modul1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class nomer3 {
    public static void main(String[] args) throws UnknownHostException, java.lang.SecurityException, IOException {
        System.out.println("looking up host address:");
        try {
            String host = "www.google.com";

            InetAddress[] ia = InetAddress.getAllByName(host);
            System.out.println("host name : " + host);
            System.out.println("host adress : ");
            for (int ip = 0; ip < ia.length; ip++) {
                    System.out.println(ia[ip]);
                
            }

        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
    public static void kiki(String[] args) throws UnknownHostException, java.lang.SecurityException {
        System.out.println("Looking Up Host Address");
        try {
            String host = "www.google.com";
            InetAddress[] ia = InetAddress.getAllByName(host);

            System.out.println("Host Name: "+host);
            System.out.println("\nHost Address: ");

            for (int i = 0; i < ia.length; i++) {
                System.out.println(ia[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
}
}
