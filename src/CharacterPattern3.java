public class CharacterPattern3 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Outer loop for the line change
        for (int i = 1; i <= n; i++) {

            // Initializing the character with alphabet A (ASCII value)
            int character = 65;

            // Inner loop for the character printing
            for (int j = 1; j <= i; j++) {

                // Printing the character without changing the line
                System.out.print((char)character++);

            }

            // Line change
            System.out.println();
        }
    }
}
