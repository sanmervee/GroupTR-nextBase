package com.NextBase.utilities;

public class BrowserUtils {
      /*
    Method that will accept int
    wait for given second duration
      1 sec = 1000 milli second
        1*1000 = 1000
     */

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something happened in the sleep method");
        }

    }
}