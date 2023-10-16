import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){

        //Define the variables
        int num, basValue, basNumber=0, sum=0, tempNum;

        //Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for a number
        System.out.print("Bir sayı giriniz : ");
        num = inp.nextInt();
        tempNum = num;

        //Calculate the # of digits, value of digits and the sum of digits
        while(tempNum != 0){
            tempNum /= 10;
            basNumber++;
        }
        System.out.println("Basamak sayısı " +basNumber);

        tempNum = num;
        for(int i=1; i<=basNumber; i++){
            basValue = tempNum % 10;
            sum += basValue;
            tempNum /= 10;
            System.out.println("Basamak değeri = " +basValue);
        }

        System.out.print(num+ " sayısının basamakları toplamı = " +sum);

    }
}
