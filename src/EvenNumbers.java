import  java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args){

        //Define the variables
        int n,i,num, sum=0;
        double avr;

        //Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for the number
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        //Find even numbers and sum these numbers
        for(i=0; i<=n; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println(n+ " saysına kadar olan çift sayıların toplamları :" +sum);
        //Find the # of even numbers and average of these even numbers
        if(n%2==0){
            num = n/2;
        }else{
            num = (n-1)/2;
        }

        avr = (double)sum/num;
        System.out.println(n+ " sayısına kadar olan çift sayıların ortalaması :" +avr);
    }
}
