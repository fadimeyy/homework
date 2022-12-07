/*
 * klavyeden girinilen n sayısı kadar üçgensel sayısı listeleyen program
 *üçgensel sayılar n*(n+1)/2 seklinde yazılabilen sayılar
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double u;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n= input.nextInt();
        for (int i = 1; i <=n; i++) {
            u=i*(i+1)/2;
            System.out.println(u);
        }
    }
    
}
