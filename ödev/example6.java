/*
 *cullen sayılar bulduran program
 *terim sayısı kadar cullen sayıları sıralayan program
 *n*2^n+1 şeklinde yazılan sayılara cullen sayı denir
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        int a;
        for (int i = 0; i <=n; i++) {
            double sayi=Math.pow(2,i);
            a=(int)(sayi*i)+1;
            System.out.println(a);
        }
        
    }
    
}
