
/*tribonacci serisi sayılarını listeleyen program 
 *kendsinden önceki 3 sayının toplamı 
 *1 1 2 4 7 13 24 44
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        int t1=1;int t2=1;int t3=2;int t4;
        System.out.println(t1+ "," +t2+"," + t3);
        for (int i = 1; i <=n-3; i++) {
            t4=t1+t2+t3;
            System.out.println(t4);
            t1=t2;
            t2=t3;
            t3=t4;
            
        }
    }
    
}
