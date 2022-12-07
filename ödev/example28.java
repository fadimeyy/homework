/*
 * klavyeden girilen f2 fibonacci sayısından bir önceki ve bir sonraki sayıyı yazdıran program
 * a=(1+5^0.5)/2
 * f1=f2/a ,f2,f3*a
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir fibonnaci sayısı giriniz:");
        int f2=input.nextInt();
        double a=(1+Math.pow(5, 0.5))/2;
        double f1=f2/a;
        double f3= f2*a;
        System.out.println(f1+","+f2+","+f3);
    }
    
}
