package apr2024;

import java.util.Objects;
import java.util.Scanner;

public class CLITest {
    public static void main(String[] args) {
        boolean isRunnable = true;
        Scanner scanner = new Scanner(System.in);
        while (isRunnable) {
            System.out.println("종료를 원하면 exit");
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String firstNumber = scanner.next();
            if (firstNumber.equals("exit")) {
                System.out.println("exit");
                System.exit(0);
            }


            System.out.print("두 번째 숫자를 입력하세요: ");
            String secondNumber = scanner.next();
            if (secondNumber.equals("exit")) {
                System.out.println("exit");
                System.exit(0);
            }


            System.out.print("수행할 연산(+, -, *, /)을 입력하세요: ");
            String operation = scanner.next();
            if (operation.equals("exit")) {
                System.out.println("exit");
                System.exit(0);
            }

            int result = 0;
            switch (operation) {
                case "+":
                    result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                    break;
                case "-":
                    result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                    break;
                case "*":
                    result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                    break;
                case "/":
                    if (Integer.parseInt(secondNumber) == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    } else {
                        result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
                    }
                    break;
            }
            System.out.println(result);
        }
    }
}

