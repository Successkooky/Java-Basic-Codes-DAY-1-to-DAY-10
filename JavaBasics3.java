import java.util.*;
public class JavaBasics3 {
    
    public static void main(String args[])
    {
        
        try (Scanner sc = new Scanner(System.in)) {
            String name=sc.next();
            System.out.println(name);
            String name2=sc.nextLine();
            System.out.println(name2);

            int num=sc.nextInt();
            System.out.println(num);

            float price=sc.nextFloat();
            System.out.println(price);
        }

        

    }
}
