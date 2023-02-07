/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
import java.util.Scanner;
public class DonguOdev2 {
    public static void main(String[] args) {
        int sayi = 0;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        while (sayi % 2 != 1){
            System.out.println("Bir sayı giriniz:");
            sayi = input.nextInt();
            if (sayi % 4 == 0){
                toplam = toplam + sayi;
            }

        }
        System.out.println("Toplam = " + toplam);
    }
}
