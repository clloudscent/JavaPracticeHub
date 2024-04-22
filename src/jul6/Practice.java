package jul6;

import jul04.Toy;

public class Practice {
    public static void main(String[] args) {
        System.out.println(Toy.brand);

        Toy.printBrand();

        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 7);

        Person person = new Person();
        person.myCalculator = new Calculator();

        person.calculateSummation(7, 5);

        System.out.println(person.numNowThinking);
    }
}
