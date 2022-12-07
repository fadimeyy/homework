/*
 * Leyland sayıları hesaplama
 * X^Y VE Y^X TOPLAMI ŞEKLİNDE YAZILAN SAYILAR LEYLAND SAYILARDIR
 * X VE Y SAYISINA KADAR BÜTÜN LEYLAND SAYILARI YAZDIRABİLEN PROGRAM
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir x sayısı giriniz:  ");
        int x= input.nextInt();
        System.out.println("lütfen bir y sayısı giriniz: ");
        int y=input.nextInt();
        int t;
        
        for (int i = 2; i <=x; i++) {
            for (int j = 2; j <=y; j++) {
               double sayi2=Math.pow(i,j);
               double sayi1=Math.pow(j,i);
               t=(int) (sayi1+sayi2);
                System.out.println(t);
                
            }
   
                
            
        }
        
  
        
    }

 
}
