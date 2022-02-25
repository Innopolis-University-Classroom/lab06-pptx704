package ru.inno.ssdlab06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCurrencyConverter {

   @Test
   public void testCurrency()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     CurrencyConverter currency = new CurrencyConverter();

     //converting rouble to usd

     float convertedUsd = currency.convert(1, "rouble", "usd");

     boolean isGreaterThanOne = convertedUsd > 80f;

     boolean isLessThanTwenty = convertedUsd < 85f;

     // action
     // Main.main(null);

     assertTrue(currency.convert(5, "chf", "kwd") >= 0.73);

     assertTrue(isGreaterThanOne);
     assertTrue(isLessThanTwenty);

     // assertion
     // assertEquals("Hello world!\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
