import java.util.Scanner;
public class DiamondWithStars {
        public static void main(String[] args) {
            int n,i,j,k;

            Scanner inp = new Scanner(System.in);
            System.out.print("Satır sayısını giriniz :");
            n = inp.nextInt();

            if(n % 2 == 0){
                for(i=0; i<=n/2; i++){
                    for(j=0;j<((n/2)-i); j++){
                        System.out.print(" ");
                    }
                    for(k=1; k <= (2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }
                for(i=(n/2)+1; i<=n; i++){
                    for(j=0;j<(i-((n/2)+1)); j++){
                        System.out.print(" ");
                    }
                    for(k=1; k <= (21-2*i);k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }

            }

            if(n % 2 != 0){
                for(i=0; i<=(n-1)/2; i++){
                    for(j=0;j<(((n-1)/2)+1-i); j++){
                        System.out.print(" ");
                    }
                    for(k=1; k <= (2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }


                for(i=((n-1)/2)+1; i<=n; i++){
                    for(j=0;j<(i-(((n-1)/2)+1)); j++){
                        System.out.print(" ");
                    }
                    for(k=1; k <= (15-2*i);k++){
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }

            }



        }

    }

