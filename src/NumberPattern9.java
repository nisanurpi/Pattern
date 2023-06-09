public class NumberPattern9 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Upper half
        // Outer loop for the line change
        for(int i=1; i<=n; i++) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the 2 spaces without changing the line
                System.out.print("  ");
            }

            // Inner loop2 for the number printing
            for(int k=1; k<=(2*i)-1; k++) {

                if( k==1 || k== (2*i)-1 )
                    // Printing first & last number only
                    System.out.print(i+" ");
                else
                    // Printing middle with spaces (Each times 2 spaces)
                    System.out.print("  ");
            }

            // Line change
            System.out.println();
        }

        // Lower half
        // Outer loop for the line change
        for(int i=n-1; i>=1; i--) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the 2 spaces without changing the line
                System.out.print("  ");
            }

            // Inner loop2 for the number printing
            for(int k=1; k<=(2*i)-1; k++) {

                if( k==1 || k== (2*i)-1 )
                    // Printing first & last number only
                    System.out.print(i+" ");
                else
                    // Printing middle with spaces (Each times 2 spaces)
                    System.out.print("  ");
            }

            // Line change
            System.out.println();
        }
    }

}
