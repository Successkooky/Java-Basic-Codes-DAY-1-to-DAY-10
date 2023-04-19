import java.util.*;
public class JavaBasics16 {

    public static void main(String args[])
    {
        //Print nos from 1 to 100
        int counter=0;
        while (counter<101)
        {
            System.out.println(counter);
            counter++;
        }


        try (//Print no from 1 to n-->given by user
        Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            int counter1=1;
            while(counter1<n)
            {
                System.out.println(counter1);
                counter1++;
            }
        }

    }
    
}
