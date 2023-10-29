// java program to find factorial of a  number
import java.util.*;
public class factorial{
    public static void main(String[] args ){
        int n =0 , i=0 , fact=1;
        System.out.println("Enter n : ");
        Scanner sc=new Scanner(System.in);{
        n=sc.nextInt();
            for( i=1 ; i<=n ; i=i+1 )
            {
                fact =fact*i ;
            }
        System.out.println("factorial of " + n + " = " + fact);

        }


    }
}
