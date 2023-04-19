import java.util.*;

public class JavaBasics6 {
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
        }
        //Tpye conversion
        int a=25;
        long b=a;
        System.out.println(b);
        /*
         Vice versa is not possible
         */


        //Type casting
        //If Java Doesnt allow some conversions we sometimes force it

        float c=25.24f;
        int d=(int) c;
        System.out.println(d);



        //type Promotion
        char e='e';
        char f='f';
        System.out.println((int) f);
        System.out.println((int) e);
        System.out.println(e);//will not be printed as an integer 
        System.out.println(f-e);


        //Type promotion only takes place if theres an operation 

    // Typr casting example

    short g=5;
    byte h=43;
    char i='i';
    byte bt=(byte)(g+h+i); //no sense in the answer its a garbage value
    System.out.println(bt);


    //Type promotion 2nd rule
    //If one operand is long float or double the whole expression is converted to float double or long

    int k=54;
    float l=43.34f;
    long m=25;
    double n=30;
    double ans=l+m+n+k;
    System.out.println(ans);


    }
    
}
