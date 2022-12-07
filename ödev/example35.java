/*brothers formulü
 *2*i+2/(2*i+1)! 
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n= inp.nextInt();
        double toplam=0;
        for (int i = 0; i <=n; i++) {
            int temp=2*i+1;
            int fak=1;
            for (int j = 1; j <=temp; j++) {
                fak=fak*j;
            }
            toplam+=(double)(temp+1)/fak;
            
        }
        System.out.println(toplam);
    }
    
}
