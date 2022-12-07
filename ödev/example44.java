/* altın üçgen ikizkenar üçgenlere denir
 *klavyeden kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program
 *6.84
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lüutfen bir a sayısı giriniz: ");
        double a=inp.nextDouble();
        double b=a*(1+Math.sqrt(5))/2;
        System.out.println(a+" , "+b+" , "+b);
                
    }
    
}
