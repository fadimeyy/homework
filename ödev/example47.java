
/*dost sayılar
 *m nin kendisi hariç tüm bölenlerinin toplamı n ye eşitse
 *n nin kendisi hariç tüm bölenleri toplamı m ye eşitse
 *m ve n dost sayılardır.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example47 {
 private static Object input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner input=new Scanner(System.in);
       int toplama=0;
       int toplamb=0;
        System.out.println("lütfen bir m sayısı giriniz:");
        int  a= input.nextInt();
        System.out.println("lütfen bir n sayısı giriniz:");
        int b =input.nextInt();
        for (int i = 1; i < a; i++) {
            if(a%i==0){
              toplama=toplama+i;                
            }
        }
            for (int j = 1; j <= b-1; j++) {
                if(b%j==0){
                    toplamb=toplamb+j;
                }
            }
                 if(b==toplama && a==toplamb){
                 System.out.println("m ve n dost sayılardır.");
             }
                 else{
                      System.out.println("m ve n dost sayılar değildir.");
                 }
    }
    
}
