import java.util.Scanner;
public class MaxMinValues {

    public static void main(String[] args){
        int n,max,min,num;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = inp.nextInt();

        max = n;
        min = n;

        for(int i=1; i<=n; i++){
            System.out.print(i+ ". sayıyı giriniz :");
            num = inp.nextInt();

            if(num > max){
                max = num;
            }
             if(num < min){
                 min = num;
            }
        }
        System.out.println("En büyük sayı : " +max);
        System.out.println("En küçük sayı : " +min);




    }
}
