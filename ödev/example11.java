/*6.92
 * mükemmel sayı listelemek
 * 2^n*2^n+1-1 
 *2^n+1-1 asal ise mükemmel sayıdır
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        double b;
        double s;
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
           a=Math.pow(2, i);
           b=Math.pow(2, i+1)-1;
             for (int j = 2; j < b; j++) {
            if(b%j!=0 && b!=1){
              
            }
             
            
        }
              s=a*b; 
             System.out.println(s);
        }
      
    }
    
}
