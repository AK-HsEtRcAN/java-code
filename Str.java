class Str1 {
    int a ;
    int b ;

    void addno(int x ,int y ){
        a=x;
        b=y ;
    }
}

class Str{
    public static void main(String[] args ){
        int add ;
        Str1 the =new Str1( );
        the.addno(5,6);
        add = the.a + the.b ;
        System.out.println("a+b= "+add);

    }
}