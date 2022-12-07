/*girilen 2 sayısının bağdaşık sayı olup olmadıgını söyleyen program
 * Bağdaşık sayı onlar basamakları aynı ve birler basamakları toplamı 10 olan sayılardır 
 * 
 * 
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1,a2,b1,b2;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz:");
        int a= input.nextInt();
        System.out.println("Lütfen bir b sayısı giriniz:");
        int b=input.nextInt();
        a1=a/10;
        b1=b/10;
        a2=a%10;
        b2=b%10;
        if(a1==b1 && a2+b2==10){
            System.out.println(a+ " ve " +b+ " Bağdaşık sayıdır.");
        }
        else{
           System.out.println(a+ " ve " +b+ " Bağdaşık sayı değildir."); 
        }
    }
    
}
