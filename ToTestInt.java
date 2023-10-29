// write a program to create a interface name test in the interface the member function is square
//  implement the interface in arithmetic class create one new class called ToTestInt . int this class use the object of arithmetic class
interface Test {
    int square(int num);
}
class Arithmetic implements Test {
    @Override
    public int square(int num) {
        return num * num;
    }
}

class ToTestInt {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.square(5);
        System.out.println("Square: " + result);
    }
}
