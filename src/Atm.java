import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, passWord;
        int balance = 10000, select, right = 3;

        Scanner inp = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            passWord = inp.nextLine();

            if (userName.equals("patika") && passWord.equals("dev123")) {
                System.out.println("Tebrikler sisteme giriş yaptınız :");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin ");
                    System.out.println("""
                            1- Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış Yap""");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz para miktarını giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                        break;

                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını giriniz : ");
                            int prc = inp.nextInt();
                            if (prc > balance) {
                                System.out.println("Bakiyeniz yetersiz : ");
                            } else {
                                balance -= prc;
                            }
                        break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);

                        break;
                    }

                } while (select != 4);

                System.out.println("Sistemden çıkış yaptınız. İyi günler.");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
            }
            if (right == 0) {
                System.out.println("Hesabınız blok olmuştur. Bankanız ile iletişime geçiniz:");
            }else{
                System.out.println("Kalan hakkınız : " +right);
            }
        }
    }
}




