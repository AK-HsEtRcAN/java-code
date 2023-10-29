 class StudentInfo {
    public static void main(String[] args) {
        String[] studentNames = {
                "Akash", "Amit", "Ashish", "Aum", "Ayush",
                "Devansh", "Keshav", "Kamlesh", "Kashuik", "Atul", "Dhruv", "Piyush"
        };

        int[] rollNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        try {
            System.out.println("Student Details:");
            for (int i = 0; i < 12; i++) {
                System.out.println("Roll Number: " + rollNumbers[i] + "\tName: " + studentNames[i]);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " );
        }
    }
}
