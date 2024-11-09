import java.util.Scanner;

public class IT24104023Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();

        String NumberString = Integer.toString(number);

        for (char digit : NumberString.toCharArray()) {
            System.out.print(digit + " ");
        }

        input.close();
    }
}