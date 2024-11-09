import java.util.Scanner;

public class IT24104023Lab3Q1B {
    public static void main (String[] args) {

        double pricePerkg, quantity, totalAmount, discountedprice;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerkg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        totalAmount = pricePerkg * quantity;
        discountedprice = totalAmount - (totalAmount * 0.1);

        System.out.println();
        System.out.println("The total amount is: " + discountedprice);
    }
}