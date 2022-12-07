/*pisagor üçlemesini hesaplayan program
 *a<b<c a^2+b^2=c^2
 * a+b+c=n 
 * sağlayan a b c sayıları pisagor üçlemesi
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class examle31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz:");
        int n = input.nextInt();
        int c;
        for (int a = 1; a <=n-1; a++) {
            for (int b = a+1; b <=n-a; b++) {
                c=n-(a+b);
                if(a*a+b*b==c*c){
                    System.out.println(a+","+b+","+c);
                }
            }
        }
                
    }
    
}
