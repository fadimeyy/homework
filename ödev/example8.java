/*her iki basamağıda asal sayı olan iki basamakları sayıları listeleyen program
 */
/**
 *
 * @author Fadime ERBAY
 */
public class example8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s=0;
        int b=0;
        int a=0;
        for (int i = 2; i <=7; i++) {
            if(i==2||i==3||i==5||i==7){
                a=10*i;
            }
            for (int j = 2; j <= 7; j++) {
            if(j==2||j==3||j==5||j==7){
                b=j;
                 s=a+b;
        System.out.println(s);        
            }
        }
        
        }
    }
}