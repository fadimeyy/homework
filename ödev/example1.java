/*ln2 buldurma
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n =input.nextInt();
        double t=0;
        for (int i = 0; i <= n-1; i++) {
            t = t+(1/((2*i+1)*(2*i+2)));
            System.out.println(t);
        }
    }   
}