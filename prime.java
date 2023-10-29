public class prime {
    public static void main(String[] args) {
        // java program to find prime number

        int n, a = 0, b = 0, temp = 0, num = 0;
        n = 17;
        for (int i = 2; i < n ; i++) {
            if ((n % i) == 0) {
                temp++;
                break;

            }
        }
        if (temp ==0 && n !=1) {
            System.out.println("prime no ");

        }else {
            System.out.println("NOT prime : ");
        }
    }
}