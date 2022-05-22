package java_complete_reference.networking;

import java.io.IOException;
import java.io.*;
import java.net.Socket;

public class GetWhoisInfo {

    public static void main (String ... arg){
        try{
            int c;
            int pn = 43;

            // create a socket connected to internic.com & port 43
            Socket s = new Socket("whois.internic.com",pn);

            // Obtain Input & output Streams
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            // Construct a request java_complete_reference.string & site of which we want to get information
            String str = (arg.length == 0 ? "google.com" : arg[0]) + "\n";

            //convert java_complete_reference.string into bytes
            byte[] buf = str.getBytes();

            // send Request
            os.write(buf);

            // read & display response
            while ((c = is.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
