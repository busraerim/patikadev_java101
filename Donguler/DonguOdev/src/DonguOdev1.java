/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;
public class DonguOdev1 {
    public static void main(String[] args) {
        int sayi;
        int sum=0;
        int sayac=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi = input.nextInt();

        for ( int i = 0 ; i<= sayi ; i++){
            if (i % 3 ==0 & i % 4 ==0){
                sum += i;
                sayac ++;
            }
        }
        //System.out.println("3 ve 4'e bölünebilen sayılar toplamı:"+ sum);
        //System.out.println(sayac);
        System.out.println("Ortalama:" + sum/sayac);
    }
}
