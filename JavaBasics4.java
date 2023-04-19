import java.util.*;

public class JavaBasics4 {
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            int num1=s.nextInt();
            int num2=s.nextInt();
            int sum=num1+num2;
            int product=num1*num2;
            System.out.println(sum);
            System.out.println(product);
        }

    }
    
}
