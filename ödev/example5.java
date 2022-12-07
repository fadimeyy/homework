/*
 *hilbert sayısı bulduran program
 *sayı 4k+1 seklinde yazılabiliyora hilbert sayısıdır
 * and open the template in the editor.
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("bir n sayısı giriniz: ");
        int n=input.nextInt();
        if ((n-1)%4==0){
            System.out.println("hilbert sayısıdır.");
        }
        else{
              System.out.println("hilbert sayısı değildir.");  
        }
    }   
}