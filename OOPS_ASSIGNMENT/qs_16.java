package OOPS_ASSIGNMENT;

public class qs_16 {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3};
        String str = null; // This will cause NullPointerException

        // Outer try block for Array Index Out of Bounds
        try {
            // Accessing an array index
            System.out.println("Accessing element at index 5: " + numbers[5]); // This will cause ArrayIndexOutOfBoundsException

            // Inner try block for Null Pointer Exception
            try {
                System.out.println("String length: " + str.length()); // This will cause NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Error: Cannot call method on a null object.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}

