import java.util.*;

public class JavaBasics10 {
    public static void main(String args[])
    {
        try (//Odd or Even 
        Scanner input = new Scanner(System.in)) {
            int num=input.nextInt();
            if(num%2==0)
            {
                System.out.println("You entered even no");

            }
            else{
                System.out.println("You entered odd number");
            }
        }
    }
    
}
