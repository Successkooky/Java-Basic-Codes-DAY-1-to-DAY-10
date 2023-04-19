
import java.util.*;;
public class JavaBasics13 {
    public static void main(String args[])
    {
        //Switch statement
        int number=2;
        switch (number) {
            case 1:System.out.println("Samosa");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Maggi");
            break; 
                
        
            default:
            System.out.println("wake up to realtiy");
                break;


           

            

        }
        try (//calculator
        Scanner input = new Scanner(System.in)) {
            int a=input.nextInt();
            int b=input.nextInt();
            char ch=input.next().charAt(0);
            switch (ch) {
                case '+':
                System.out.println(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/':System.out.println(a/b);

            
                default:
                System.out.println("Invalid");
                    break;
            }
        }
    }
    
}
