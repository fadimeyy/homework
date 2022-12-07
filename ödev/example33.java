/*klavyeden girilen x değeri için yine klavyeden girilen terim sayısı kadar seriye açarak e^x i hesaplayan program
 *Maclaurin serisi açılımı
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp= new Scanner(System.in);
        System.out.println("lütfen bir x sayısı giiriniz:");
        int x=inp.nextInt();
        System.out.println("lütfen bir n sayısı giiriniz:");
        int n=inp.nextInt();
        double toplam=1;
        for (int i = 1; i <=n; i++) {
            int fak=1;
            fak=fak*i;
            toplam=toplam+(Math.pow(x, i)/fak);
             System.out.println(toplam);
        }
       
    }
    
}
