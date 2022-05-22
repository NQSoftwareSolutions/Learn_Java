package java_complete_reference.networking;

import java.net.InetAddress;

import static java_complete_reference.networking.NetworkMethods.getIP;

public class GetIP{
    public static void main(String[] args) {
        try{
            String url = "www.google.com";
            InetAddress inetAddress =  InetAddress.getByName(url);

            // check time out of connection
            inetAddress.isReachable(100);

            // get ip of provided Url
            InetAddress ip = getIP("www.google.com");

            //Print host name & address
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());

            // get & print local Host (System) ip address
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host : "+localAddress);

            // print hostname & ip address
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);

            // print all hostnames & ip addresses for provided url
            InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
            for (int i = 0 ; i < SW.length ; i++ ){
                System.out.println(SW[i]);
            }
            }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
