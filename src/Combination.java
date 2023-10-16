import java.util.Scanner;
public class Combination {
    public static void main(String[] args){

        //Define the variables
        int n, r, i,total=1, total2=1, total3=1, C;

        //Define the Scanner Class
        Scanner scan = new Scanner(System.in);

        //Ask user for the variables
        System.out.print("Kümenin eleman sayısını giriniz : ");
        n = scan.nextInt();
        System.out.print("Oluşturulacak grupların kaç elemanlı olacağını giriniz :");
        r = scan.nextInt();

        //Calculate the n!, r! and (n-r)!
        for(i=1; i<=n; i++){
            total = total * i;
        }
        for (i=1; i<=r; i++){
             total2 = total2 * i;
        }
        for(i=1; i<=n-r; i++){
            total3= total3 * i;
        }

        /* Calculate the number of different groups of r elements
        that can be formed by the elements of a set of n elements. */

        C = total / (total2 * (total3));
        System.out.print("C(");
        System.out.print(n + ",");
        System.out.print(r + ") = ");
        System.out.print(C);

    }
}
