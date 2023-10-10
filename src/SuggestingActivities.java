import java.util.Scanner;
public class SuggestingActivities {
    public static void main(String[] args){
        //Define the variables
        double heat;

        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask user for the temperature
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextDouble();

        //Suggest Activity according to air temperature
        if(heat <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(heat >= 5 && heat <=10){
            System.out.println("Sinemaya gidebilirsiniz");
        }else if(heat >=10 && heat<=15){
            System.out.println("Sinemaya gidebilir veya piknik yapabilirsiniz");
        }else if(heat >=15 && heat<=25){
            System.out.println("Pikniğe gidebilirsiniz");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz");}

    }
}
