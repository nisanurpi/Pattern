public class StarPattern18 {
    public static void main(String[] args) {

        // Initializing required number of lines/rows
        int n = 5;

        // Outer loop for the line/row change
        for(int i=n; i>=1; i--) {

            // Inner loop for the star and space printing
            for(int j=1; j<=i; j++) {

                if( j == 1 || j == i || i==n ) {
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
