import java.util.Scanner;

public class IT22908360Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double totalBill = price * kilograms;
        double discount = totalBill * 0.10;
        double amountToPay = totalBill - discount;

        System.out.println("Total bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Amount you have to pay: " + amountToPay);
    }
}