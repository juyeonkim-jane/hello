package Test;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 7;i++) {
            int j = sc.nextInt();
            if (j%2 == 0)
                even++;
            else
                odd++;

        }
        System.out.println("odd : "+ odd);
        System.out.println("even : " + (even-1));
    }
}
