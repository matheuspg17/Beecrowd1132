
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2, numeromaior = 0, numeromenor = 0, total = 0;
        
        num1 = leia.nextInt();
        num2 = leia.nextInt();
        
        if (num1 > num2){
            numeromaior = num1;
            numeromenor = num2;
        } else {
            numeromaior = num2;
            numeromenor = num1;
            
        }
        
        for (int i = numeromenor; i <= numeromaior; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
