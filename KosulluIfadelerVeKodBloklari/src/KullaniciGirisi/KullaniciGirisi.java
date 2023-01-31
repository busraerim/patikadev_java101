/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */


package KullaniciGirisi;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String id = "Büşra";
        String idpassword = "büşra123";
        String username, password, newpassword;
        int sifirlama;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz:");
        username = input.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password = input.nextLine();

        if(username.equals(id) && password.equals(idpassword)) {
            System.out.println("Giriş yapıldı");

        } else{
            System.out.println("Hatalı giriş.");
            System.out.println("Şifrenizi sıfırlamak istiyorsanız 1'i, istemiyorsanız 2'ye basınız:");
            sifirlama = input.nextInt();
            if (sifirlama == 1){
                Scanner input2 = new Scanner(System.in);
                System.out.println("Lütfen yeni şifrenizi giriniz:");
                newpassword = input2.nextLine();
                if (newpassword.equals(idpassword)){
                    System.out.println("Yeni şifreniz eskisi ile aynı olamaz.");
                }else{
                    System.out.println("Şifreniz değiştirildi.");
                }
            }else {
                System.out.println("Sonlandırıldı.");
            }

        }
    }
}
