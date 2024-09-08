import java.util.Scanner;

// Custom Exception

class MyInputException extends Exception {
    public MyInputException(String message) {
        super(message);
    }
}

public class MyExceptionHandler {

    // Main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("ENTER A POSITIVE NUMBER : ");
            int number = scanner.nextInt();

            // Check if the number is negative

            if (number < 0) {
                throw new MyInputException("NUMBER CANNOT BE NEGATIVE.");
            }

            System.out.println("YOU ENTERED : " + number);
        } catch (MyInputException e) {
            System.out.println("ERROR : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR : INVALID INPUT.");
        } finally {
            scanner.close();
        }
    }
}
