import java.util.Scanner;
public class MultiplesOfFour {
    public static void main(String[] args){

        //Define variables
        int n, total = 0;

        //Define Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask user for the number
            do{
                System.out.print("Bir sayı giriniz : ");
                n = inp.nextInt();
                   if(n%4==0 || n%2==0){
                      total += n;
                   }
            }while(n%2==0);

        System.out.println("Toplam = " +total);

    }
}
