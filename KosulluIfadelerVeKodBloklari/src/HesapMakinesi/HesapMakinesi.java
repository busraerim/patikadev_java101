// switch case ile basit hesap makinesi yapma

package HesapMakinesi;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double a,b;
        int islem;
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayı:");
        a = input.nextDouble();
        System.out.println("2.sayı:");
        b = input.nextDouble();

        System.out.println("Toplama işlemi için 1'e \nÇıkarma işlemi için 2'ye \nÇarpma işlemi için 3'e \n" +
                "Bölme işlemi için 4'e basınız.");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Hatalı işlem seçimi.");
        }
    }
}
