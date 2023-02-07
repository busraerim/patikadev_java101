/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
ifadelerini ekrana yazan programı Java dilinde yazınız.
Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/
import java.util.Scanner;
public class DonguOdev4 {
    public static void main(String[] args) {
        int sayi;
        int i;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi = input.nextInt();
        for(i = 1 ; i < sayi ; i++){
            if (sayi % i ==0){
                toplam = toplam + i;
            }
        }
        if (sayi == toplam){
            System.out.println(sayi+ " bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi+ " mükemmel sayı değildir.");
        }
    }
}
