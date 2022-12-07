/*klavyeden girilen terim sayısı kadar kare üçgensel sayı listeleyen program
 *hem düzgün üçgen hem de kare oluşturulabilen sayılar
 *
*/

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k0=0;
        int k1=1;
        double k2;
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen n terim sayısını giriniz:");
        int n=input.nextInt();
        System.out.println(k1);
        for (int i = 1; i < n; i++) {
            k2=34*k1-k0+2;
            System.out.println(k2);
            k0=k1;
            k2=k1;
        }
    }
    
}
