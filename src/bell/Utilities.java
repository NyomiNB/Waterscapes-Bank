/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bell;

/**
 *
 * @author HPro1
 */
public class Utilities {
    private String convertToCash(double amount) {
        String cash = String.format("$%,.2f", amount);
        return cash;
    }
    private double doubleFromCash(String cash) {
        cash = cash.replace("$", "");
                cash = cash.replace(",", "");
                if (isNumeric(cash)) {
                    return Double.parseDouble(cash); 
                } else {
                    return 0.0;
                }

    }
         public static boolean isDouble(String text) {
        double newDouble = 0.0;
        try {
            newDouble = Double.valueOf(text);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }//end of isDouble method

    public static boolean isInteger(String text) {
        int newInt = 0;
        try {
            newInt = Integer.valueOf(text);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }//end of isInteger method

    public static boolean isNumeric(String text) {
        return (isDouble(text) || isInteger(text));
    }//end of isNumeric

}
