import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int num = sc.nextInt();

        System.out.println("Hexadecimal number is : "
                + Integer.toHexString(num).toUpperCase());
    }
}