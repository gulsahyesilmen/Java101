import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args){
        int n;
        double sum=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = inp.nextInt();

        for( int i = 1; i<=n; i++){
            sum += (1.0/i);
        }

        System.out.print("Harmonik serinin ilk " +n );
        System.out.println(" teriminin toplamı = " + sum);
    }
}
