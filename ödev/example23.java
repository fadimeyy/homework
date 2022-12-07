/*klavyeden girilen terim sayısı kadar fibonacci sayısını listeleyen program
 * fibonacci sayısı kendinden önceki tam sayının toplamı
 * 1 2 3 5 8 13....
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        int t1=1;int t2=1;int t3;
        System.out.println(t1+"," +t2);
        for (int i = 1; i <=n-2; i++) {
            t3=t1+t2;
            System.out.println(t3);
            t1=t2;
            t2=t3;
        }
    }
    
}
