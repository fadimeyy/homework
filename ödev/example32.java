
/*random harfi 10 defada tahmim etme oyunu
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Random;
import java.util.Scanner;
public class example32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        Random r=new Random();
        char c =(char)(r.nextInt(26)+'a');
        System.out.println(c);
        for (int i = 1; i <=10; i++)
        {
            if(c==inp.next().charAt(0)){
                System.out.println(i+". denemede bildiniz");
            }
            System.out.println("bilemediniz.");
        }
        
    }
    
}
