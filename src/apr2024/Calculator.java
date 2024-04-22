package apr2024;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

    public class Calculator {
        private ScriptEngine engine;

        public Calculator() {
            // ScriptEngine을 통해 JavaScript 수식 계산기 생성
            ScriptEngineManager sem = new ScriptEngineManager();
            this.engine = sem.getEngineByName("JavaScript");
        }

        public double evaluate(String expression) throws ScriptException {
            // 주어진 수식을 계산하고 결과를 반환
            return (double) engine.eval(expression);
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();
            Scanner scanner = new Scanner(System.in);

            System.out.println("수식을 입력하세요 (예: 3*4+100/(5-3)):");
            String expression = scanner.nextLine(); // 사용자 입력 받기

            try {
                double result = calc.evaluate(expression); // 수식 계산
                System.out.println("계산 결과: " + result);
            } catch (ScriptException e) {
                System.out.println("계산 중 오류가 발생했습니다: " + e.getMessage());
            }

            scanner.close();
        }
    }


