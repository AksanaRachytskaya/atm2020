import java.util.Scanner;

public class Calculator {
    private int result = 0;

    public void start() {
        String operand = "";

        while (true) {
            showMenu();
            operand = readOperand("Please enter operand: ");
            if ("Q".equals(operand)) {
                System.out.println("Thanks for using the app!");
                break;
            }
            int number = readNumber("Please enter number: ");
            switch (operand) {
                case "+":
                    addMethod(number);
                    break;
                case "-":
                    minusMethod(number);
                    break;
                case "/":
                    divideMethod(number);
                    break;
                case "*":
                    multiplyMethod(number);
                    break;
            }
        }
    }

    private void showMenu() {

        System.out.println("- Minus");
        System.out.println("* Multiply");
        System.out.println("/ Divide");
        System.out.println("Q Quit");
        System.out.println("Your current value is: " + result);
    }

    private String readOperand(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

    }

    private int readNumber(String message) {
        int result = 0;
        boolean isValid = false;
        do {
            try {
                result = Integer.parseInt(readOperand(message));
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please reenter.");
            }

        } while (!isValid);
        return result;
    }

    private void addMethod(int number) {
        result += number;
    }

    private void minusMethod(int number) {
        result -= number;
    }

    private void divideMethod(int number) {
        result /= number;
    }

    private void multiplyMethod(int number) {
        result *= number;
    }
}


