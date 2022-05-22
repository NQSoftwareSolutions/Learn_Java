package java_complete_reference.networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String ... arg) throws MalformedURLException {
        URL mURL = new URL("http://www.HerbSchildt.com/WhatsNew");

        System.out.println("Protocols  : "+ mURL.getProtocol());
        System.out.println("Host Name : "+ mURL.getHost());
        System.out.println("File Name : "+ mURL.getFile());
        System.out.println("Port Number : "+ mURL.getPort());
       System.out.println("External form of URL : "+ mURL.toExternalForm());
    }
}
