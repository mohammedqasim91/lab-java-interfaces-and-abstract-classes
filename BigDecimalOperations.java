import java.math.BigDecimal;

public class BigDecimalOperations {

    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    public static double reverseSignAndRoundToNearestTenth(BigDecimal number) {
        BigDecimal reversedNumber = number.negate(); // Reverse the sign
        return reversedNumber.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    //public static void main(String[] args) {
     //   BigDecimal number1 = new BigDecimal("4.2545");
     //   double roundedNumber1 = roundToNearestHundredth(number1);
     //   System.out.println("Rounded number to the nearest hundredth: " + roundedNumber1);

      //  BigDecimal number2 = new BigDecimal("-6.789");
      //  double roundedNumber2 = roundToNearestHundredth(number2);
      //  System.out.println("Rounded number to the nearest hundredth: " + roundedNumber2);
    // }

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.2345");
        double reversedAndRoundedNumber1 = reverseSignAndRoundToNearestTenth(number1);
        System.out.println("Reversed sign and rounded number to the nearest tenth: " + reversedAndRoundedNumber1);

        BigDecimal number2 = new BigDecimal("-45.67");
        double reversedAndRoundedNumber2 = reverseSignAndRoundToNearestTenth(number2);
        System.out.println("Reversed sign and rounded number to the nearest tenth: " + reversedAndRoundedNumber2);
    }



}
