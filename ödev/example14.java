/*girilen sayının eksik sayı olup olmadığını bildiren eksik miktarını bildiren  program
 *sayının tam bölenlerinin toplamı sayının 2 katından eksik ise eksik sayıdır
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s=0;
        int f;
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                s=s+i;
            }}
            if(s<n*2){
                f=2*n-s;
                System.out.println("Eksik sayısıdır "+f+" kadar eksiktir.");
            }
            else{
                System.out.println("Eksik sayı değildir.");
            
            
            }
        
    }
    
}
