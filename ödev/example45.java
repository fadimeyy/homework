/*gümüş oran uygun bölen program
 *(2*a+b)/a=a/b
 * 
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir u sayısı giriniz: ");
        int u=inp.nextInt();
        double b=u/(2+Math.sqrt(2));
        double a=u-b;
        System.out.println(a+" , "+b);
                
    }
    
}
