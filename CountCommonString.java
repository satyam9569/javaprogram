
    import java.util.Scanner;

public class CountCommonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // Convert the string into a character array
        String[] str1 = str.split("");

        // Sort the character array
        java.util.Arrays.sort(str1);

        // Initialize variables
        int count = 1;

        // Loop through the sorted characters to count occurrences
        for (int i = 0; i < str1.length - 1; i++) {
            if (str1[i].equals(str1[i + 1])) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(str1[i] + "," + count);
                }
                count = 1; // Reset count for the next character
            }
        }

        // Print the count for the last character
        if (count > 1) {
            System.out.println(str1[str1.length - 1] + "," + count);
        }
    }
}
