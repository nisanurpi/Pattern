public class NumberPattern1 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Outer loop for the line change
        for(int i=1; i<=n; i++) {

            // Inner loop for the number printing
            for(int j=1; j<=i; j++) {

                // Printing the number without changing the line
                System.out.print(i+" ");
            }

            // Line change
            System.out.println();
        }
    }
}
