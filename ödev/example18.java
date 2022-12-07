/*ore sayı olup olmadıgını söyleyen program
 *bölenlerin ortalaması tam sayı ise ore sayıdır
 *bölen sayısı/1/a+1/b+1/c tam sayı
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s;
        double t;
        
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
             s=+1;
             t=+(1/i);
            if(s%t==0){
                System.out.println(n+" ore sayıdır.");
            }
            else{
                System.out.println(n+" ore sayı değildir.");
            
            }
            }
        }
    }
    
}
