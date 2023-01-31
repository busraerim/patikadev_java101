/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */

package Taksimetre;
import java.util.Scanner;
public class TaksimetreOdev {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        System.out.println("Kaç kilometre gittiniz:");
        double kilometre = km.nextDouble();

        double taksimetre = 10 + kilometre * 2.20;

        double odenecek_ucret = taksimetre < 20 ? 20: taksimetre;

        System.out.println("Ödenecek tutar:" + odenecek_ucret);


    }
}
