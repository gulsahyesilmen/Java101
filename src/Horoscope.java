import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args){

        //Define the variables
        int month, day;
        String horoscope;

        //Define the Scanner Class
        Scanner inp = new Scanner(System.in);

        //Ask the user for birthday month and day
        System.out.print("Kaçıncı ayda doğdunuz : ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = inp.nextInt();

        //Print the horoscope of the user on the screen
        if(month == 1){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    horoscope = "Oğlak";
                    System.out.println("Burcunuz :" +horoscope);
                }else{
                    horoscope ="Kova";
                    System.out.println("Burcunuz :" + horoscope);
                }
            }
        }
        if(month ==2){
            if(day >= 1 && day <= 29){
                if(day < 20){
                    horoscope = "Kova";
                    System.out.println("Burcunuz :" +horoscope);
                }else{
                    horoscope ="Balık";
                    System.out.println("Burcunuz :" + horoscope);
                }
            }
        }
        if(month ==3){
            if(day >= 1 && day <= 31){
                if(day < 21){
                    horoscope = "Balık";
                    System.out.println("Burcunuz :" +horoscope);
                }else{
                    horoscope ="Koç";
                    System.out.println("Burcunuz :" + horoscope);
                }
            }
        }
        if(month ==4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "Koç";
                    System.out.println("Burcunuz :" + horoscope);
                } else {
                    horoscope = "Boğa";
                    System.out.println("Burcunuz :" + horoscope);
                }
            }
        }
        if(month == 5){
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        horoscope = "Boğa";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="İkizler";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==6){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        horoscope = "İkizler";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Yengeç";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==7){
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Yengeç";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Aslan";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==8){
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Aslan";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Başak";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==9){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        horoscope = "Başak";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Terazi";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==10){
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        horoscope = "Terazi";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Akrep";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==11){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        horoscope = "Akrep";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Yay";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        if(month ==12){
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        horoscope = "Yay";
                        System.out.println("Burcunuz :" +horoscope);
                    }else{
                        horoscope ="Oğlak";
                        System.out.println("Burcunuz :" + horoscope);
                    }
                }
        }
        }
    }
