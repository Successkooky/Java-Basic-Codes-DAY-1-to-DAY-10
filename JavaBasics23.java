
import java.util.*;
public class JavaBasics23 {
    

    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();

            if(n==2){
                System.out.println("It is a Prime no");

            }
            else{
                boolean isPrime=true;
                for (int i = 2; i <= n-1; i++) {
                    if(n%i==0){
                        isPrime=false;
                    }
                    
                }

                if(isPrime==true){
                    System.out.println("n is prime");

                }
                else{
                    System.out.println("n is not prime");
                }
            }
        }
    }

    
        
            
    }




    

    

