
import java.util.*;
public class JavaBasics12 {
    
    public static void main(String args[])
    {
        //Print the largest of the three
        
    try (Scanner input = new Scanner(System.in)) {
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int max=0;
        if(num1>num2 && num1>num3)
        {
            max=num1;
            System.out.println(max);
        }
        else if(num2>num1 && num2>num3)
        {
            max=num2;
            System.out.println(max);
        }
        else
        {
            max=num3;
            System.out.println(max);
        }
    }
    }
    }
    
