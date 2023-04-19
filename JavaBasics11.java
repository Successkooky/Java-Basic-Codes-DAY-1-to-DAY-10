
import java.util.*;
public class JavaBasics11 {
    public static void main(String args[])
    {
        //Income tax calculator

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please input your salary");
            int salary=input.nextInt();
            if(salary<500000)
            {
                System.out.println("You dont need to pay taxes");
            }
            else if(salary<=1000000 && salary>500000)
            {
                System.out.println("You need to 20%tax");
                int tax_20=(int) (salary*(0.2));
                System.out.println("So your tax is" + tax_20);
            }
            else
            {
                System.out.println("You need to 20%tax");
                int tax_30=(int) (salary*(0.3));
                System.out.println("So your tax is" + tax_30);
            }


         System.out.println("tell ur marks");
         int marks=input.nextInt();
         int pass_marks=33;
         String passing=(marks>pass_marks)? "Pass":"Fail";
         System.out.println(passing);
        }

        //Ternary operator 
         
         int number=4;
         String type=(number%2==0) ? "even":"odd";
         System.out.println(type);

         
         
    }
    
}
