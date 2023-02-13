//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

import java.util.Scanner;
public class AsalSayi {
    static String Asal(int a, int sayi)
    {
        while (sayi > 0) {
            if (a % sayi != 0) {
                return Asal(a, sayi - 1);
            } else if (sayi == 1 & a % sayi == 0) {
                return "Asal sayıdır.";
            } else {
                return "Asal sayı değildir.";
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a = input.nextInt();
        System.out.println(Asal(a,a-1));
    }
}
