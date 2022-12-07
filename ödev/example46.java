/*
 * aritmetik sayı olup olmadığını test program
 * pozitif tam sayının pozitif tam bölenleri ortalaması tam sayı ise aritmetik sayıdır
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example46 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int a=input.nextInt();
        int t=0;
        int s=0;
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                t=t+i;
                s=s+1;
            }
        }
           if(t%s==0){
               
               System.out.println("aritmetik sayıdır.");
           }
           else{
                System.out.println("aritmetik sayı değildir.");
           }
    }  
}
