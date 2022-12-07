/*
 * floyd üçgeni
 * girilen n satır sayısı kadar sayıları sırala
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n=input.nextInt();
        int s=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                 System.out.print(s);
                 s=s+1;
                 System.out.print("    ");
            }
             System.out.println();
        }
       
    }
    
}
