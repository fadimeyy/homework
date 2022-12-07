/*klavyeden girilen n sayısına göre n. bell sayısını hesaplayan program
 * 6.123
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example3 {
    public static double fak(int c){
        int a=1;
        for (int i = 1; i <=c; i++) {
            a=a*i;
            
        }
        return a;
    }
    public static double comb(int x, int y){
        return fak(x)/(fak(y)*fak(x-y));
    }
    public static double s(int n ,int k){
        double t=0;
        for (int i = 0; i <=k; i++) {
            t+=Math.pow(-1, i)*comb(k,i)*Math.pow(k-1, n);            
        }
        return t*(1/fak(k));
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("n i gir: ");
        int n=inp.nextInt();
        int t=0;
        for (int i = 1; i <=n; i++) {
            t+=s(n,i);
        }
        System.out.println(t);
    }
    
}
