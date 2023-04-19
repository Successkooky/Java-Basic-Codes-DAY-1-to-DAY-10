import java.util.*;
public class JavaBasics21 {

    public static void main(String args[])
    {
        //Break and Continue Statement
        for(int i=0;i<=10;i++)
        {
            if(i==5){
                break;
            }
            System.out.println(i);


        }

        //keep entering numbers till the user enters a multiple of 10

        try (Scanner input = new Scanner(System.in)) {
            int num;
            do {
                num=input.nextInt();
                if (num%10==0) {
                    break;
                }
                System.out.println(num);
            } while (true);
        }

    }
    
}
