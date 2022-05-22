package java_complete_labs_oracle;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumericalDemo {
    public static void main(String... aeg){
        //Todo get the locale
        Locale locale = Locale.FRANCE;
        System.out.println("Locale is "+locale);

        //Todo get currency format no any locale specified
        double price = 1.23;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Currency formate for France is "+currencyFormat.format(price));

        //Todo get currency format any locale
        price = 1.23;
        NumberFormat currencyFormatLocale = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency formate for France is "+currencyFormatLocale.format(price));

        //Todo get persentage format but no any locale specified any locale
        double percentage = 0.2;
        NumberFormat percentageFormat = NumberFormat.getPercentInstance();
        System.out.println("Percentage format for France is "+percentageFormat.format(percentage));

        //Todo get persentage format any locale
        percentage = 0.2;
        NumberFormat percentageFormatLocale = NumberFormat.getPercentInstance(locale);
        System.out.println("Percentage format for France is "+percentageFormatLocale.format(percentage));

        // Change the locale & do same operations for UK locale
        locale = Locale.UK;
        System.out.println("Locale is "+locale);

        //Todo get currency format any locale
        price = 1.23;
        currencyFormatLocale = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency formate for France is "+currencyFormatLocale.format(price));

        //Todo get persentage format any locale
        percentage = 0.2;
        percentageFormatLocale = NumberFormat.getPercentInstance(locale);
        System.out.println("Percentage format for France is "+percentageFormatLocale.format(percentage));

       }
}
