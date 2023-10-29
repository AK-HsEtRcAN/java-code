public class Str1a {
    public static void main(String[] args) {
        String a = "hello Akash Aswal";
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32); // Convert to uppercase by subtracting 32 from the ASCII value.
            }
            result.append(c);
        }

        System.out.println(result.toString());
    }
}
