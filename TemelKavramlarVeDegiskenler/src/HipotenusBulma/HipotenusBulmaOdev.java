/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */

package HipotenusBulma;
import java.util.Scanner;
public class HipotenusBulmaOdev {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3;

        Scanner kenar = new Scanner(System.in);

        System.out.print("1. kenarı giriniz:");
        kenar1 = kenar.nextDouble();

        System.out.print("2. kenarı giriniz:");
        kenar2 = kenar.nextDouble();


        System.out.print("3. kenarı giriniz:");
        kenar3 = kenar.nextDouble();

        double cevre = kenar1 + kenar2 + kenar3;
        double u = cevre / 2;
        double alan = Math.sqrt (u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin çevresi:" + cevre);
        System.out.println("Üçgenin alanı:" + alan);



    }


}
