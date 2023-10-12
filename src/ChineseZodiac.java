import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {

        //Define the variables
        int year, reminder;

        //Define the Scanner class
        Scanner inp = new Scanner(System.in);

        //Ask the user her/his birthday year
        System.out.print("Doğum yılınız : ");
        year = inp.nextInt();

        //Calculate the reminder when dividing the year by 12
        reminder = year % 12;

        //Print the zodiac horoscope on the screen
        switch (reminder) {
            case 0:
                System.out.println("Zodyak Burcunuz : Maymun");
                break;

            case 1:
                System.out.println("Zodak Burcunuz : Horoz");
                break;

            case 2:
                System.out.println("Zodak Burcunuz : Köpek");
                break;

            case 3:
                System.out.println("Zodak Burcunuz : Domuz");
                break;

            case 4:
                System.out.println("Zodak Burcunuz : Fare");
                break;

            case 5:
                System.out.println("Zodak Burcunuz : Öküz");
                break;

            case 6:
                System.out.println("Zodak Burcunuz : Kaplan");
                break;

            case 7:
                System.out.println("Zodak Burcunuz : Tavşan");
                break;

            case 8:
                System.out.println("Zodak Burcunuz : Ejderha");
                break;

            case 9:
                System.out.println("Zodak Burcunuz : Yılan");
                break;

            case 10:
                System.out.println("Zodak Burcunuz : At");
                break;

            case 11:
                System.out.println("Zodak Burcunuz : Koyun");
                break;
        }

    }
}
