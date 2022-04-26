//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class CrackMe {
    public CrackMe() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("What is the flag?");
        String var2 = var1.nextLine();
        if (var2.length() != 22) {
            System.out.println("Not the flag :(");
        } else {
            char[] var3 = new char[var2.length()];

            int var4;
            for(var4 = 0; var4 < var2.length(); ++var4) {
                var3[var4] = var2.charAt(var4);
            }

            for(var4 = 0; var4 < var2.length() / 2; ++var4) {
                char var5 = var3[var2.length() - var4 - 1];
                var3[var2.length() - var4 - 1] = var3[var4];
                var3[var4] = var5;
            }

            int[] var10 = new int[]{19, 17, 15, 6, 9, 4, 18, 8, 16, 13, 21, 11, 7, 0, 12, 3, 5, 2, 20, 14, 10, 1};
            int[] var11 = new int[var3.length];

            for(int var6 = var10.length - 1; var6 >= 0; --var6) {
                var11[var6] = var3[var10[var6]];
            }

            Random var12 = new Random();
            var12.setSeed(431289L);
            int[] var7 = new int[var2.length()];

            for(int var8 = 0; var8 < var2.length(); ++var8) {
                var7[var8] = var11[var8] ^ var12.nextInt(var8 + 1);
            }

            String var13 = "";

            for(int var9 = 0; var9 < var7.length; ++var9) {
                var13 = var13 + var7[var9] + ".";
            }

            System.out.println("\nYOUR FLAG: " + var13);
            if (var13.equals("116.122.54.50.93.66.98.117.75.51.97.78.104.119.90.53.94.36.105.84.40.69.")) {
                System.out.println("Congrats! You got the flag!");
            } else {
                System.out.println("Not the flag :(");
            }

        }
    }
}
