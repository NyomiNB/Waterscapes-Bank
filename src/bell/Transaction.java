/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bell;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HPro1
 */
public class Transaction {
   private final LocalDate DATE; 
   private final BigDecimal AMOUNT;
   private final String TYPE;
   DateTimeFormatter style  = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public Transaction(BigDecimal AMOUNT, String TYPE) {
        DATE = LocalDate.now();
        this.AMOUNT = AMOUNT;
        this.TYPE = TYPE;
    }

    public LocalDate getDATE() {
        return DATE;
    }
    public String getStringDATE() {
        return DATE.format(style);
    }


    public BigDecimal getAMOUNT() {
        return AMOUNT;
    }

    public String getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return DATE.format(style) + " $" + AMOUNT.setScale(2,RoundingMode.HALF_UP) + " " + TYPE + "\n";
    }
}
