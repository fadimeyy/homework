/*pi sayısı hesaplama
 *john wallis 
 *6.78
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n= inp.nextInt();
        double c=1;
        for (int i = 1; i <=n; i++) {
            double c1=4*i*i;
            c*=(c1/(c1-1));
        }
       System.out.println(2*c);
    }
    
}
