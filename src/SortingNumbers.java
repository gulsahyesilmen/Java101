import java.util.Scanner;
public class SortingNumbers {
    public static void main(String[] args){

        //Define the variables
        double n1,n2,n3;

        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask the user for numbers
        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz :");
        n3 = input.nextDouble();

        //Sort the numbers

        if(n1 > n2 && n1 > n3 ){
            if(n2>n3){
                System.out.println("n1>n2>n3");
            }else{
                System.out.println("n1>n3>n2");}
        }else if(n2>n1 && n2>n3) {
            if (n1 > n3) {
                System.out.println("n2>n1>n3");
            } else {
                System.out.println("n2>n3>n1");
            }
        }else{
            if(n1>n2){
                System.out.println("n3>n1>n2");
            }else{
                System.out.println("n3>n2>n1");
            }
        }
    }
}
