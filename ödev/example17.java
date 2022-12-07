/*
 * markov denklemi
 *x,y,z 1 ve 50 arasında olmalı
 *x^2+y^2+z^2=3*x*y*z seklinde çözümlenen denklemenin elemanlarını sıralayan program
 */

/**
 *
 * @author Fadime ERBAY
 */
public class example17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 50; i++) {
            for (int j = i; j < 50; j++) {
                for (int k = j; k <=50; k++) {
                    if(i*i+j*j+k*k==3*i*k*j){
                        System.out.println(i+","+j+","+k);
                    }
                }
                
            }
            
        }
    }
    
}
