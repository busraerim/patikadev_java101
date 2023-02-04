//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;
public class DonguOdev3 {
    public static void main(String[] args) {
        int kuvvet,i;
        int carpim = 4;
        int sayac = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("4'ün kaçıncı kuvvetine kadar hesaplamak istiyorsunuz:");
        kuvvet = input.nextInt();
        System.out.println("4^0=1");

        for (i =1; i<= kuvvet; i++){
            while (sayac<i){
                carpim =carpim*4;
                sayac ++;

            }
            System.out.println("4^" + i +"=" + carpim);
        }

    }
}
