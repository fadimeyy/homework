/*asal çarpanlar
 * klavyeden girilen sayının asal çarpanlarını bulan program
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example49 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       int b=2;
       System.out.println("lütfen bir sayı giriniz: ");
       int a =input.nextInt();
       while(a>1)
           if (a%b==0)
           {
               System.out.println(b);
               a/=b;
           }
           else{
               b++;
           }
    }   
}