package java_complete_labs_oracle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String... arg){
//        double price = 1.852, rate = 1.065;
//
//        price -= price * rate;
//        price = Math.round(price * 100)/100.0;
//
//        System.out.println(price);

        // TODO do some math with big decimal for same above operations
        BigDecimal price = new BigDecimal(1.852);
        BigDecimal rate = new BigDecimal(0.065);

        price = price
                .subtract(price
                        .multiply(rate))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println(price);
    }
}
