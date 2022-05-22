package java_complete_labs_oracle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {
    public static void main (String ... arg){
         //Todo create a local
        Locale locale = Locale.UK;
        // Todo load Resource bundle
        ResourceBundle msg = ResourceBundle.getBundle("message");
        // Todo get data from bundle
        String offerPattern = msg.getString("offer");
        System.out.println(offerPattern);
    }
}
