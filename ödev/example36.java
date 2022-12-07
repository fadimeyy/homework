/*
 * pi sayısı hesaplama 
 * Madhava of sangamagrama
 *6.77
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n=inp.nextInt();
        double toplam=0;
        for (int i = 0; i <=n-1; i++) 
        {
            
            toplam+=Math.pow(-1,i)/((double)(2*i+1)*Math.pow(3,i));
          
            
        }
        toplam=Math.sqrt(12)*toplam;
        System.out.println(toplam);
    
    }
    
}
