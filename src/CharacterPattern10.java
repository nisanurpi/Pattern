public class CharacterPattern10 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Upper half
        // Outer loop for the line change
        for (int i = n; i >= 1; i--) {

            // Inner loop1 for the space printing
            for (int j = 1; j <= n-i; j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Inner loop2 for the character printing
            for (int k = 1; k <= (2*i)-1; k++) {

                if(k == 1 || k == (2*i)-1) {
                    // Printing the character without changing the line
                    System.out.print("A");
                }else {
                    // Printing the space without changing the line
                    System.out.print(" ");
                }
            }

            // Line change
            System.out.println();
        }

        // Lower half
        // Outer loop for the line change
        for (int i = 2; i <= n; i++) {

            // Inner loop1 for the space printing
            for (int j = 1; j <= n-i; j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Inner loop2 for the character printing
            for (int k = 1; k <= (2*i)-1; k++) {

                if(k == 1 || k == (2*i)-1) {
                    // Printing the character without changing the line
                    System.out.print("A");
                }else {
                    // Printing the space without changing the line
                    System.out.print(" ");
                }
            }

            // Line change
            System.out.println();
        }
    }
}
