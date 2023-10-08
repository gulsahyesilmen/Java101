import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        //Define the variables
        int n1,n2,select;

        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask user for inputs
        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        //Ask user for operation
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n ");
        select = input.nextInt();

        //Make the calculation
        switch(select){
            case 1:
                System.out.println("Toplam ="+ (n1+n2));
                break;
            case 2:
                System.out.println("Fark = "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım =" + (n1*n2));
                break;
            case 4:{
                if (n2 != 0){
                    System.out.println("Bölüm = " +(n1/n2));}
                else{
                    System.out.println("Bir sayı sıfıra bölünemez!");}}
                    break;
            default:
            System.out.println("Yanlış bir seçim yaptınız !");
        }



    }
}
