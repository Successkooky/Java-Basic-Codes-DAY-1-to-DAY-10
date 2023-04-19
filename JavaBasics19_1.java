public class JavaBasics19_1 {

    //To print reverse of a number
    public static void main(String args[]){
        int number=834573985;
        while(number>0){
            int lastdigit=number%10;
            System.out.print( lastdigit);
            number=number/10;


        }
        System.out.println();
        int n=235435342;
        int rev=0;
        while(n>0){
            int lastdigit1=n%10;
            rev=(rev*10)+lastdigit1;
            n=n/10;
            
    
    
    }
    System.out.println(rev);


    //To reverse the number
   

    }

    
}
