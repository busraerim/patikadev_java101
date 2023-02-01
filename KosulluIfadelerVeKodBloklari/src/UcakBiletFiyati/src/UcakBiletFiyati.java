/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise indirimli fiyatı üzerinden %20 indirim uygulanır.

 */

import java.util.Scanner;
public class UcakBiletFiyati {
    public static void main(String[] args) {
        double mesafe, yas, yolculuktipi, ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden yazınız:");
        mesafe = input.nextDouble();
        if ( mesafe <0 ) {
            System.out.println("Hatalı veri girişi!");
        }

        System.out.println("Yaşınız:");
        yas = input.nextDouble();
        if ( yas < 0 ) {
            System.out.println("Hatalı veri girişi!");
        }

        System.out.println("Tek yön için 1'e, \nGidiş-Dönüş için 2'ye basınız:");
        yolculuktipi = input.nextDouble();
        ucret = mesafe * 0.10;

        if (yas <12 && yolculuktipi == 1){
            ucret = ucret*0.5;
            System.out.println("Ödenecek tutar:" + ucret);

        } else if (yas<12 && yolculuktipi == 2) {
            ucret = ucret*0.5*0.8;
            System.out.println("Ödenecek tutar:" + ucret);

        }else if ( 12 < yas && yas<24 && yolculuktipi==1){
            ucret = ucret*0.9;
            System.out.println("Ödenecek tutar:" + ucret);

        } else if (12 < yas && yas<24 && yolculuktipi==2) {
            ucret = ucret*0.9*0.8;
            System.out.println("Ödenecek tutar:" + ucret);

        } else if (yas>65 && yolculuktipi == 1) {
            ucret = ucret*0.7;
            System.out.println("Ödenecek tutar:" + ucret);

        }else if ( yas >65 && yolculuktipi == 2){
            ucret = ucret*0.7*0.8;
            System.out.println("Ödenecek tutar:" + ucret);

        }
        {

        }


    }
}
