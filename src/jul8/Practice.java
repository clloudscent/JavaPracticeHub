package jul8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
    String nowDate="2023-07-08";

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        System.out.println("Hello World");
        Laptop.printCpuType();

        Laptop laptopInstance = new Laptop();
        System.out.println(laptopInstance.cpuType);
        System.out.println(Laptop.cpuType);

        Car.printMachineType();


        Calculator.sum(5, 7);
        Calculator cal = new Calculator();
        //...

        //....
        System.out.println(cal.getCircleArea(2));
    }

    public void printTodayDate(){
        System.out.println(nowDate);
    }
}
