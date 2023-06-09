public class StarPattern4 {
    public static void main(String[] args) {

        // Initializing required number of lines/rows
        int n = 5;

        // Outer loop for the line/row change
        for(int i=n; i>=1; i--) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the space without changing the line
                System.out.print(" ");
            }

            // Inner loop for the star printing
            for(int k=1; k<=i; k++) {

                // Printing the star without changing the line
                System.out.print("*");
            }

            // Line/Row change
            System.out.println();
        }
    }

}

