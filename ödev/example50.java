/*1 ile 99 arasında random sayı tahmin edilme oyunu
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example50 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int max=99;
        int min=1;
        Scanner input= new Scanner(System.in);
        int randomsayi=(int) (Math.random()*(max-min-1)+min);
        int deneme=0;
        while(true){
            System.out.println("lütfen 1 ile 99 arasında bir sayı giriniz: ");
            int sayi= input.nextInt();
            deneme++;
            if(sayi>randomsayi){
                System.out.println("lütfen daha küçük bir sayı giriniz");
            }
            else if(sayi<randomsayi){
                System.out.println("lütfen daha büyük bir sayı giriniz"); 
            }
            else{
                 System.out.println("Tebrikler doğru tahmin.");
                 break;
            }
        }
         System.out.println(deneme+" kadar tahminde bulundunuz.");
    }
    
}