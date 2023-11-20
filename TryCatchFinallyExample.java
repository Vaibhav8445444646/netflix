public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = { 7, 9, 6, 9, 8, 0 };
            int index = 10; // trying to access an index out of bounds

            int result = numbers[index]; // This line will throw an ArrayIndexOutOfBoundsException

            // This line will not be executed if an exception occurs in the above line
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught exeption: " + e.getMessage());
        } finally {
            System.out.println("Finally statement executed.");
        }
    }
}
