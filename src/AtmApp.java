import javax.sound.midi.Track;
import java.security.cert.TrustAnchor;
import java.text.BreakIterator;
import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        int balance=1500;
        int right=3;


        String customerName;
        String customerPass;

            Scanner inp = new Scanner(System.in);
           while (right > 0){

            System.out.print("Patika.dev Bankasına Hoş Geldiniz.\n************\nLütfen Kullanıcı Adınızı Giriniz : ");
            customerName=inp.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            customerPass=inp.nextLine();

            if (customerName.equals("Patika") && customerPass.equals("Patika123")){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");

                int choose;
                System.out.println("Başarılı bir şekilde giriş yaptınız.Lütfen yapacağınız işlemi seçiniz \n" +
                        "1-Para Yatırma İşlemi\n2-Para Çekme İşlemi\n3-Mevcut Bakiye\n4-Çıkış");
                choose=inp.nextInt();

                switch (choose){
                    case 1 :
                        System.out.println("Lütfen yüklemek istediğiniz bakiye miktarını giriniz");
                        System.out.print("Bakiyeniz : "+balance+"TL\nEklemek istediğiniz tutar : ");
                        int addMoney=inp.nextInt();
                        balance+=addMoney;
                        System.out.println("Para yatırma işleminiz başarıyla gerçekleşmiştir.\n" +
                                "Güncel Bakiyeniz : "+balance+"TL");

                        break;
                    case 2:

                        System.out.print("Lütfen çekmek istediğiniz tutarı giriniz : ");
                        int withdrawMoney=inp.nextInt();
                        if (withdrawMoney>balance){
                            System.out.println("Yetersiz bakiye lütfen tekrar deneyiniz.");
                        }else{
                            balance-=withdrawMoney;
                            System.out.println("Para çekme işleminiz tamamlanmıştır.İyi günler dileriz\n" +
                                    "Kalan bakiyeniz:"+balance+"\sTL");
                        }
                        break;

                    case 3:
                        System.out.print("Bakiyeniz : "+balance+"\sTL");

                        break;

                    case 4:

                        System.out.println("Başarıyla çıkış yaptınız.İyi günler dileriz...");

                    break;

                    default:

                        break;
                }

                break;

            }else{
                --right;
                System.out.println("Kullanıcı adı veya şifre hatalı.Lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız "+ right );

            }
            if (right==0){
                System.out.println("Birçok kez hatalı giriş yaptınız.Lütfen bankanızla görüşünüz.");

                break;
            }

           }








    }
}
