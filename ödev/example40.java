/*kök 2 değeri
 * 6.80
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n=inp.nextInt();
        double t=1;
        for (int i = 1; i <=n; i++) {
            t=2+1/t;
            
        }
        System.out.println(1+1/t);
    }
    
}
