/* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

package KdvTutariHesaplama;
import java.util.Scanner;

public class KdvTutariHesaplamaOdev {


    public static void main(String[] args) {
        Scanner musteri_fiyat =  new Scanner(System.in);

        System.out.print("Ürün tutarını giriniz:");
        double fiyat = musteri_fiyat.nextDouble();

        double yenikdv = (fiyat < 1000 && fiyat >= 0) ? (0.18) : (0.08);
        System.out.println("KDV'siz tutar:" + fiyat);
        System.out.println("KDV tutarı:" + yenikdv);
        System.out.println("KDV'li tutar:" + (fiyat*yenikdv+fiyat));

    }
}
