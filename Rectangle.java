public class Rectangle {
    private double width ;
    private double height ;
    public  Rectangle (double width ,double height ){
        this.width =width ;
        this .height = height ;
    }

    public double calculateArea(){
        return width * height ;
    }
    public static void main(String[] args ){
Rectangle myRectangle = new Rectangle( 5.0 ,10.0 );

double area = myRectangle.calculateArea();
System.out.println("Area of the rectangle is : " + area );

    }
}
