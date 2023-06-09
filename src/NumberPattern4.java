public class NumberPattern4 {
    public static void main(String[] args) {

        // Initializing required number of lines
        int n = 5;

        // Outer loop for the line change
        for(int i=1; i<=n; i++) {

            // Inner loop for the number printing
            for(int j=1; j<=i; j++) {

                // Printing the number without changing the line
                if(j%2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }

            // Line change
            System.out.println();
        }
    }
}
