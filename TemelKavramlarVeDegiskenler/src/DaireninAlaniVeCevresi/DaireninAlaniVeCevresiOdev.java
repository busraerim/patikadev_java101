/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

 */

package DaireninAlaniVeCevresi;
import java.util.Scanner;


public class DaireninAlaniVeCevresiOdev {
    public static void main(String[] args) {
        Scanner yaricap = new Scanner(System.in);
        System.out.println("Yarıçap:");
        double r = yaricap.nextDouble();

        Scanner merkezaci = new Scanner(System.in);
        System.out.println("Merkez açı ölçüsü:");
        double aci = merkezaci.nextDouble();

        double alan = (3.14 * r * r * aci)/360;
        System.out.println("Daire diliminin alanı:" + alan);
    }
}
