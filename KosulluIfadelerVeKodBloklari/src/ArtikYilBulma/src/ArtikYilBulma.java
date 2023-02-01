//Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

import java.util.Scanner;
public class ArtikYilBulma {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yıl giriniz:");
        yil = input.nextInt();
        
        if (yil % 100 == 0 && yil % 400 ==0){
            System.out.println(yil +" artık yıldır.");
            
        } else if (yil % 100 == 0 && yil % 400 != 0 ) {
            System.out.println(yil +" artık yıl değildir.");


        } else if (yil % 4 == 0 ) {
            System.out.println(yil + " artık yıldır.");
        }
    }
}
