public class StarPattern30 {
    public static void main(String[] args) {

        // Initializing required number of lines/rows
        int n = 5;

        // Outer loop for the line/row change
        for(int i=1; i<=n; i++) {

            // Inner loop for the star and space printing
            for(int j=1; j<=n; j++) {

                if( i == 1 || j == 1 || i==n || j==n ) {
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
