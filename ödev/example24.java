/*
 * basamakları toplamı fibonaccı sayı olan iki basamaklı sayılar
 * fibonacci sayılar 1 2 3 5 8 13 en büyük basamak toplam 18 olduğu için burda biter
 */

/**
 *
 * @author Fadime ERBAY
 */
public class example24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               int s=i+j;
               if (s==1||s==2||s==3||s==5||s==8||s==13){
                   System.out.println(10*i+j);
               }
                
            }
            
        }
    }
    
}
