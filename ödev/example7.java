/*
 *fermat sayıları listeleyen program
 *2^2^i+1 şeklinde yazılan sayılar fernat sayılardır
 * and open the template in the editor.
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz: ");
        int n= input.nextInt();
        int a;
        for (int i = 0; i <=n; i++) {
            double sayi1=Math.pow(2, i);
            double sayi2=Math.pow(2, sayi1);
            a=(int)sayi2+1;
            System.out.println(a);            
        }
    }   
}