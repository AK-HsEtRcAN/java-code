import java.util.* ;
class AK{
    public static void main(String[] args){
        // Fibonacci series : 0 1 1 2 3 5  8 13 21 34 55

        int i=0 , j=0 ,sum =0,temp=0  ;
        System.out.print("enter no. to print Fibonacci Series : " );
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println("0 1 ");

        for(i=1 ; i<n ; i++)
        {
            System.out.println( sum );
            sum=i+j;
            j=sum+i;


        }



    }

}