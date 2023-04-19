import java.util.*;;

public class JavaBasics22 {

    public static void main(String args[])
    {
        for(int i=0;i<8;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }

        //display all numbers entered by user except multiples of 10

        try (Scanner input = new Scanner(System.in)) {
            do {
                int num=input.nextInt();
                if(num%10==0)
                {
                    continue;
                }
                System.out.println("You entered"+num);
            } while (true);
        }
    }
    
}
