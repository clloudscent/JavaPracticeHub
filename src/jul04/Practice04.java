package jul04;

public class Practice04 {
    public static void main(String[] args) {
        String operator = args[0];
        String num1String = args[1];
        int num1 = Integer.parseInt(num1String);
        String num2String = args[2];
        int num2 = Integer.parseInt(num2String);

        switch(operator){
            case "+":
                System.out.println("Sum Result: "+(num1+num2));
                break;
            case "-":
                System.out.println("Minus Result: "+(num1-num2));
                break;
            case "*":
                System.out.println("Multiply Result: "+(num1*num2));
                break;
            case "/":
                System.out.println("Division Result: "+(num1/num2));
                break;
        }


    }
}
