public class JavaBasics19 {

    public static void main(String args[]){
        //Printing Square pattern

        for(int i=0; i<=5;i++)
        {
            System.out.println("****");
        }


        //Print Reverse of a number 

        int n=10899;
        while(n>0)
        {
            int lastdigit=n%10;
            System.out.println("Last-digit is"+lastdigit);
            n=n/10;

        }
        System.out.println();

        //Reverse the Given number
        int a=10899;
        int rev=0;
        while(n>0)
        {
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            a=a/10;
        }






        









        int num=890056;
        
        while(num>0)
        {
            int remainder=num%10;
            System.out.println(remainder);
            num=num/10;
        }
        System.out.println();
    }
    
}
