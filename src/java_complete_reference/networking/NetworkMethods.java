package java_complete_reference.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkMethods {
    public static InetAddress getIP(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        return ip;
    }
    public static void printIP(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        System.out.println("Ip address is : "+ip);
    }
    public static void printIPArray(String url) throws UnknownHostException{
        InetAddress ip[] = InetAddress.getAllByName(url);
        for (int i = 0 ; i < ip.length ; i++ ){
            System.out.println("Ip Address is "+ip[i]);
        }
    }
    public static String getHost(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        String hostname = ip.getHostName();
        return hostname;
    }
    public static void printHost(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        System.out.println("Host Name is : "+ip.getHostName());
    }
    public static String getHostAddress(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        String host_Address = ip.getHostAddress();
        return host_Address;
    }
    public static void printHostAddress(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        System.out.println("Host Address is : "+ip.getHostAddress());
    }
    public static InetAddress getLocalHostAddress(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        InetAddress Local_host_Address = ip.getLocalHost();
        return Local_host_Address;
    }
    public static void printLocalHostAddress(String url) throws UnknownHostException{
        InetAddress ip = InetAddress.getByName(url);
        System.out.println("Local Host Address is : "+ip.getLocalHost());
    }
}
