/*palindrom sayılarılisteleyen program
 * 100 ile 9999 arasındakı sayılar
 * önden ve tersten okunuşu aynı olan sayılar
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
public class example19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(100*i+10*j+i);
                
            }
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(1000*i+100*j+10*j+i);
            }
            
        }
    }
    
}
