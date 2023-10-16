import java.util.Scanner;
public class ExponentNumber {
    public static void main(String[] args){

        //Define the variables
        int i,n,k,total=1;

        //Define Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for the variables
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = inp.nextInt();
        System.out.print("Sayının üssünü giriniz : ");
        k = inp.nextInt();

        //Calculate the powers of the number
        for (i=1; i<=k; i++){
            total = total * n;
        }

        System.out.print(n+ "^" +k);
        System.out.print("=" +total);

    }
}
