import java.util.Scanner;
public class PowersOfFourAndFive {
    public static void main(String[] args){

        //Define variable
        int n, i;

        //Define Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for the boundary value
        System.out.print("Sınır değerini giriniz : ");
        n = inp.nextInt();

        //Print on the screen if the number is the power of four and five.

        System.out.println("\t");

        System.out.println("4'ün katları :");
       for(i=1; i<n; i*=4){
            System.out.println(i);
        }

        System.out.println("\t");

        System.out.println("5'in katları : ");
       for(i=1; i<n; i*=5){
           System.out.println(i);
       }
    }
}
