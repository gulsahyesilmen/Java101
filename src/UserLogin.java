import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        //Define the variables
        String origUsername = "patika", origPassword = "java123";
        String userName, password, newPassword, reset;

        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask the user for their username and password
        System.out.print("Kullanıcı adını giriniz : " );
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : " );
        password = input.nextLine();

        //Check if username and password are correct
        if (userName.equals(origUsername) && password.equals(origPassword)) {
            System.out.println("Giriş Yaptınız!" );

        } else if ((!origPassword.equals(password)) && (origUsername.equals(userName))) {
            System.out.println("Bilgileriniz Yanlış! Şifrenizi sıfırlamak istiyor musunuz?" );
            System.out.println("Evet/Hayır" );
            reset = input.nextLine();
            if (reset.equals("Evet" )) {
                System.out.println("Lütfen önceki şifrenizden farklı bir şifre oluşturunuz : " );
                newPassword = input.nextLine();
                if ((newPassword.equals(origPassword))) {
                    System.out.println("Yeni şifre eskisi ile aynı olamaz. Lütfen başka bir şifre giriniz" );
                } else {
                    System.out.println("Yeni şifreniz başarılı bir şekilde oluşturuldu " );
                }
            }else{
                System.out.println("Kullanıcı giriş sayfasından ayrılıyorsunuz" );
            }
        }


    }}

