/*Stirling sayısı hesaplayan yinelemeli alt program fonksiyon
 *
 */
/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class example51 {
    public static int fak(int x){
        int c=1;
        for (int i = 1; i <=x; i++) {
            c=c*i;            
        }
        return c;
    }
    public static int comb(int y,int z){
        return fak(y)/(fak(y-z)*fak(z));
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("n i giriniz: ");
        int n=inp.nextInt();
        System.out.println("k yı giriniz: ");
        int k=inp.nextInt();
        double t=0;
        for (int i = 0; i <=0; i++) {
            t+=Math.pow(-1, i)*comb(k,i)*Math.pow(k-i, n);                    
        }
        System.out.println(t*(1/fak(k)));
    }   
}