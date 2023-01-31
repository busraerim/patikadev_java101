/* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Biyoloji derslerinin sınav puanlarını kullanıcıdan alan ve
ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti",
 küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak... */

package NotOrtalamaHesaplama;

import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        float mat = not.nextFloat();
        System.out.print("Kimya notunuz:");
        float kimya = not.nextFloat();
        System.out.print("Fizik notunuz:");
        float fizik = not.nextFloat();
        System.out.print("Biyoloji notunuz:");
        float biyoloji = not.nextFloat();
        float ort = (mat + fizik + kimya + biyoloji) / 4.0F;
        System.out.println("Ortalamanız:" + ort);
        String durum = ort < 60.0F ? "Sınıfta kaldınız" : "Sınıfı geçtiniz";
        System.out.println(durum);
    }
}

