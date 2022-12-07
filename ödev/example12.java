/*
 * Armastrong sayıları listeleyen program 
 *Hanelerinin küplerinin toplamı sayıya eşitse armstrong sayıdır
 * 
 */

/**
 *
 * @author Fadime ERBAY
 */
public class example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    s=100*i+10*j+k;
                    if (s == Math.pow(i, 3)+ Math.pow(j, 3) + Math.pow(k, 3)){
                        System.out.println(s);
                    }
                }
                
            }
            
        }
    }
    
}
