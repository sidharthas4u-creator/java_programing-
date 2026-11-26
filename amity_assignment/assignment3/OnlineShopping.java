import java.util.InputMismatchException;
import java.util.Scanner;

// User-defined exception
class MinimumAmountException extends Exception {
    public MinimumAmountException(String message) {
        super(message);
    }
}

public class OnlineShopping {
    // Method that validates the cart value and throws the custom exception
    public void placeOrder(int amount) throws MinimumAmountException {
        if (amount < 500) {
            throw new MinimumAmountException("Order failed: Minimum cart value of ₹500 is required. Current amount: ₹" + amount);
        }
        System.out.println("Order placed successfully for ₹" + amount + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineShopping shop = new OnlineShopping();

        try {
            System.out.print("Enter total cart amount (₹): ");
            int amount = sc.nextInt();
            shop.placeOrder(amount);
        } catch (MinimumAmountException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid integer amount.");
        } finally {
            sc.close();
        }
    }
}
