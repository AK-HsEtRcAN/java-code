import java.util.* ;
class Java1{
public static void main(String[] args ){

    int  a,b,c,max=0 ;
    System.out.println("enter first number a : ");
    Scanner sc =new Scanner(System.in); // we had create a object (sc( of Scanner class
    a=sc.nextInt();
    System.out.println("a = "+a);

    System.out.println("ENTER SECOND number b : ");
    b= sc.nextInt();
    System.out.println("b= "+b);

    c=sc.nextInt();
    System.out.println("ENTER THIRD NUMBER c :   ");
     System.out.println("c ="+c);


     if(a>b && a>c){
         max=a ;
     }
     else if(c>a && c>b ){
         max=c ;
     }
     else if (b>a && b>c){
         max=b ;
     }
   else  System.out.println(" ") ;
System.out.println("LARGEST NUMBER IS " + max );




}
}