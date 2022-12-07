/*kullanıcan isten sayı
 *mükemmel sayı kendisi hariç bütün bölenlerinin toplamı olan sayılar
 *sayının mükemmel sayı olup olmadığını bildiren program.
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s,t=0;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayısı girniz: ");
        s= input.nextInt();
        for (int i = 1; i < s; i++) {
            if(s%i==0){
                t+=i;
            }            
        }
        if(s==t){
            System.out.println("Sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Sayı mukemmel sayı değildir.");
        }
    }    
}