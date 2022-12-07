/*
 *girilen n sayısına göre palindrom sayıların toplam sayısını bulup yazdıran program
 * 9*10^((n-1)/2)
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n=input.nextInt();
        System.out.println(9*Math.pow(10, (n-1)/2));
                
    }
    
}
