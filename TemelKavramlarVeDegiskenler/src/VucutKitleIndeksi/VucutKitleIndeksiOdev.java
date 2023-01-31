/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

 */

package VucutKitleIndeksi;
import java.util.Scanner;
public class VucutKitleIndeksiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu giriniz:");
        double boy = input.nextDouble();

        double vki = kilo / (boy * boy) ;

        System.out.println("Vücut kitle endeksiniz:" + vki);
    }
}
