/*
 *girilen üst sınıra kadar heterometrik sayıları açık bi sekilde listeleyn program
 *heterometrik sayı a*(a+1) şeklinde yazılabilen sayılardır
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        int a;
        for (int i = 1; i <=5; i++) {
           
            System.out.println(i*+(i+1)+" = " +i+"*"+(i+1));
           
        }
    }
    
}
