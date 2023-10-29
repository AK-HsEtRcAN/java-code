public class rev {
    public static void main(String[] args){
        int n=12345 ;
        int  rem=0 ;
        while(n> 0){
            rem =(rem*10 )+(n%10) ;
            n=n/10;
        }
        System.out.println("reverse no : "+rem);


    }
}
