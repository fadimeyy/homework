/*kök 3 ün değeri
 * 6.81
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı girniz: ");
        int n=inp.nextInt();
        double t=1;
        for (int i = 1; i <=n-1; i++) 
        {
            t=1+(1/(2+(1/t)));
            
        }
        System.out.println(1+(1/t));
    }
    
}
