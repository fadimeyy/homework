/* altın oran
 * cb/ac=ab/cb=(1+5^2)/2
 *6.83
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen ab uzunluğunu giriniz: ");
        int ab=inp.nextInt();
        double cb=2*ab/(1+Math.pow(5,0.5));
        double ac=ab-cb;
        System.out.println(ac+","+cb);
    }
    
}
