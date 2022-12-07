/*Bell sayıları şeklindeki Dobinksi formülü saplanabilmektedir 
 *100 iterasyon ile oluşturup yazdırabilir
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı girniz: ");
        int n=inp.nextInt();
        double e=2.71;
        for (int i = 1; i <=n; i++) {
            double t=0;
            double f=1;
            for (int j =1; j <= 100; j++) {
                f*=j;
                t+=(double)Math.pow(j,i)/f;
            }  
            System.out.println(t/e);
        }
      
    }
    
}