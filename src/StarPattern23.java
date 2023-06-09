public class StarPattern23 {
    public static void main(String[] args) {

        // Initializing required number of lines/rows
        int n = 5;

        // Upper half
        // Outer loop for the line/row change
        for(int i=1; i<=n; i++) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Inner loop2 for the star and space printing
            for(int k=1; k<=i; k++) {

                if( k == 1 || k == i ) {
                    // Printing the star without changing the line
                    System.out.print("*");
                }else {
                    // Printing the space without changing the line
                    System.out.print(" ");
                }
            }

            // Line/Row change
            System.out.println();
        }

        // Lower half
        // Outer loop for the line/row change
        for(int i=(n-1); i>=1; i--) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Inner loop2 for the star and space printing
            for(int k=1; k<=i; k++) {

                if( k == 1 || k == i || i==n ) {
                    // Printing the star without changing the line
                    System.out.print("*");
                }else {
                    // Printing the space without changing the line
                    System.out.print(" ");
                }
            }

            // Line/Row change
            System.out.println();
        }
    }
}
