/*klavyeden girilen üst sınıra göre asal sayıları listeleyen program
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s;
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n= input.nextInt();
        for (int i = 2; i <=n; i++) {
            s=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0){
                    s++;
                }}
                if(s==2){
                    System.out.println(i);
                }
                
                
            
        }
     
        
    }
    
}
