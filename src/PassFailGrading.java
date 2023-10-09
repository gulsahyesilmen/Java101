import java.util.Scanner;
public class PassFailGrading {
    public static void main(String[] args){

        //Define the variables
        double math,phys,turkish,chem,music,average;
        double summ=0,nofclas=0;

        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask user for grade and check if it is less than 0 && greater than 100
        System.out.print("Matematik notunuzu giriniz : ");
        math = input.nextDouble();
        if(math >= 0 && math <= 100) {
            summ += math;
            ++nofclas;
        }else {
            System.out.println("Yanlış giriş yaptınız. Lütfen 0 ile 100 arasında bir not giriniz.");
        }
        System.out.print("Fizik notunuzu giriniz : ");
        phys = input.nextDouble();
        if(phys>= 0 && phys <= 100){
            summ +=phys;
            ++nofclas;
        }else {
            System.out.println("Yanlış giriş yaptınız. Lütfen 0 ile 100 arasında bir not giriniz.");
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = input.nextDouble();
        if(turkish>= 0 && turkish <= 100){
            summ += turkish;
            ++nofclas;
        }else {
            System.out.println("Yanlış giriş yaptınız. Lütfen 0 ile 100 arasında bir not giriniz.");
        }
        System.out.print("Kimya notunuzu giriniz : ");
        chem= input.nextDouble();
        if(chem>= 0 && chem <= 100){
            summ += chem;
            ++nofclas;
        }else{
            System.out.println("Yanlış giriş yaptınız. Lütfen 0 ile 100 arasında bir not giriniz.");
        }
        System.out.print("Müzik notunuzu giriniz : ");
        music = input.nextDouble();
        if(music>= 0 && music <= 100){
            summ += music;
            ++nofclas;
        }else {
            System.out.println("Yanlış giriş yaptınız. Lütfen 0 ile 100 arasında bir not giriniz.");
        }

        //Calculate the average
        average = summ/nofclas;

        if(average<55) {
            System.out.println("Sınıfı geçemediniz!" );
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız = " +average);

    }
}
