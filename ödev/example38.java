/*Pİ sayısı hesaplama
 * Monte Carlo yöntemiyle hesaplanan
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Random;
import java.util.Scanner;
public class example38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("lütfen bir n sayısı giriniz:");
        int n=inp.nextInt();
        double m=0;
        for (int i = 1; i <=n; i++) {
            double x=rastgele.nextDouble();
            double y=rastgele.nextDouble();
            if(Math.pow(x, 2)+Math.pow(y, 2)<1){
                m=m+1;
                
            }
            
        }
        System.out.println(4*m/(double)n);
    }
    
}
