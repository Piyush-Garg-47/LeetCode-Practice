import java.util.*;
public class Binary2Decimal {
    public static String Decimal(int n){
        String res ="";
        while( n > 0){
            if(n % 2 ==0){
               res = 0 + res ; 
            }else {
                res = 1 +res ;
            }
            n =n/2 ; 
        }
        return res ; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello piyush !!");
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
       System.out.println( "The binary conversin of the number " +n +" is " + Decimal(n));
    }
}
