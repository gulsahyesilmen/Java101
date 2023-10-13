import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        //Define the variable
        int year, rmdr, rmdr2, rmdr3;

        //Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask user the year and calculate the remainder
        System.out.print("Bir yıl giriniz : ");
        year = inp.nextInt();
        rmdr = year%100;
        rmdr2 = year%400;
        rmdr3 = year%4;

        //Query whether the entered year is a leap year.
        if((rmdr == 0 && rmdr2== 0) || (rmdr != 0 && rmdr3 == 0)){
                System.out.println( year + " artık bir yıldır.");
        }else{
                System.out.println(year + " artık bir yıl değildir.");
        }
    }
}
