/*kullanıcıdan istenen üst sınıra göre
 *Tau sayısını listeleyen program
 *tam bölenlerinin sayısına tam bölünen sayılara tau sayısı denir
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir üst sınır belirleyiniz");
        int n=input.nextInt();
            
        for (int i = 1; i <=n; i++) {
            int s=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0){
                    s=s+1;
                }
                if(i%s==0){
                    System.out.println(i);
                }  
            }
        }
    }
    
}
