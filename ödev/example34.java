/*
 * binom açılımı örnek 6.75
 
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.println("lütfen bir x sayısı giriniz");
        int x=inp.nextInt();
        System.out.println("lütfen bir n sayısı giriniz");
        int n=inp.nextInt();
        double sonuc=(double)Math.pow(1+(x/n), n);
        System.out.println(sonuc);
    }
    
}
