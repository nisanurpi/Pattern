public class NumberPattern5 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Outer loop for the line change
        for(int i=1; i<=n; i++) {

            // Inner loop1 for the space printing
            for(int j=1; j<=(n-i); j++) {

                // Printing the space without changing the line
                System.out.print("  ");
            }

            // Inner loop2 for the number printing
            for(int k=1; k<=(2*i)-1; k++) {

                // Printing the number without changing the line
                System.out.print(i+" ");
            }

            // Line change
            System.out.println();
        }
    }
}
