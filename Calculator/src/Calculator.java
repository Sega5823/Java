import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double operand1 = operand();
        boolean nonStop = true;
        while (nonStop) {
            boolean notClean = true;
            char requiredOperation = operation();
            switch (requiredOperation) {
                case '+':
                    operand1 += operand();
                    break;
                case '-':
                    operand1 -= operand();
                    break;
                case '/':
                    operand1 /= operand();
                    break;
                case '*':
                    operand1 *= operand();
                    break;
                case 'c':
                    operand1 = operand();
                    notClean = false;
                    break;
                case 's':
                    nonStop = false;
                    break;
            }
            if (nonStop && notClean) {
                System.out.println("Результат: " + operand1);
            }
        }
    }

    private static char operation(){
        System.out.print("Введите операцию: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
    private static double operand(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}