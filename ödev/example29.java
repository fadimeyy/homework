/*pell sayıları ekrana yazdıran program
 * ((1+(2^0.5))^i-(1-(2^0.5))/(2*(2^0.5)) seklinde yazılabilen sayılar pell sayılardır

 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen terim sayısını giriniz: ");
        int n=input.nextInt();
        int p1=0;int p2=1;int p3;
        System.out.println(p1+","+p2);
        for (int i = 0; i <=n-2;i++) {
            p3=2*p2+p1;
            System.out.println(p3);
            p1=p2;
            p2=p3;
        }
        
      
    }
    
}
