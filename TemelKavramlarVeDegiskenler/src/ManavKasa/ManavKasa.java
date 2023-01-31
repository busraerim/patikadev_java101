/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
package ManavKasa;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kg:");
        armut = input.nextDouble();
        System.out.println("Elma kg:");
        elma = input.nextDouble();
        System.out.println("Domates kg:");
        domates = input.nextDouble();
        System.out.println("Muz kg:");
        muz = input.nextDouble();
        System.out.println("Patlıcan kg:");
        patlican = input.nextDouble();

        toplam = armut*2.14 + elma*3.67 + domates*1.11 + muz * 0.95 + patlican*5;
        System.out.println("Toplam tutar:" + toplam);

    }
}
