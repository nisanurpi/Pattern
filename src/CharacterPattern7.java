public class CharacterPattern7 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Outer loop for the line change
        for (int i = n; i >= 1; i--) {

            // Inner loop1 for the space printing
            for (int j = 1; j <= n-i; j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Initializing the character before alphabet A (ASCII value)
            int character = 64;

            // Inner loop2 for the character printing
            for (int k = 1; k <= (2*i)-1; k++) {

                if(k <= i) {
                    // Printing the character without changing the line
                    System.out.print((char)++character);
                }else {
                    // Printing the character without changing the line
                    System.out.print((char)--character);
                }
            }

            // Line change
            System.out.println();
        }
    }
}
