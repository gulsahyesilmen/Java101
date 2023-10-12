import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args){

        //Define the variables
        double km, cutprice, rtcutprice, perkm=0.10;
        int age, type;

        //Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for age, distance and types of trip
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Lütfen yolculuk mesafesini giriniz : ");
        km = inp.nextDouble();
        System.out.print("Lütfen yolculuk tipini giriniz 1-Tek yön / 2- Gidiş Dönüş : ");
        type = inp.nextInt();


        //Calculate the price of the flight tiicket according to age,km and types of trip
        if(age > 0 && km > 0 && (type == 1 || type == 2)){
            if(age < 12){
                cutprice = (km * perkm) - ((km*perkm)*0.5);
                if(type == 1){
                    System.out.println("Bilet fiyatı = " +cutprice);
                  }else {
                    rtcutprice = cutprice - (cutprice * 0.2);
                      System.out.println("Bilet fiyatı = " + rtcutprice);
                  }
            }


            if(age > 12 && age < 24){
                cutprice = (km * perkm) - ((km*perkm)*0.1);
                if(type == 1){
                    System.out.println("Bilet fiyatı = " +cutprice);
                }else{
                    rtcutprice = cutprice - (cutprice*0.2);
                    System.out.println("Bilet fiyatı = " +rtcutprice);
                }
            }

            if(age > 65){
                cutprice = (km * perkm) - ((km*perkm)*0.3);
                if(type == 1){
                    System.out.println("Bilet fiyatı = " +cutprice);
                }else{
                    rtcutprice = cutprice - (cutprice * 0.2);
                    System.out.println("Bilet fiyatı = " +rtcutprice);
                }
            }
        }else{
            System.out.println("Hatalı bilgi girdiniz! ");

        }

    }
}
