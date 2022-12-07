/*
 * cosx fonksiyon maclaurin serisine açılımı
 * verilen terim sayısına kadar seriye açarak hesaplayan program
 * 1-x^2/2!
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ,is ; 
        double aci,x,f,t=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Aci değeri: ");
        aci=input.nextDouble();
        System.out.println("terim sayısı: ");
        n=input.nextInt();
        x=Math.toRadians(aci);
        is=1;
        for (int i = 1; i < n; i++) {
            f=1;
            for (int j = 1; j <=2*i; j++) {
                f*=j;
                is*=(-1);
                t+=is*Math.pow(x,2*i)/f;
                
            
            System.out.printf("\nseri açılımı ile hesaplanan değer: %5f\n", t);
            System.out.printf("komutla hesaplanan değer: %5f\n", Math.cos(x));
        }
    }
    
}
}
