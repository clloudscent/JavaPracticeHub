package jul14.person;

import java.util.Arrays;
import java.util.Scanner;

public class PersonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] peopleArray = new Person[5];

        int sum = 0;
        int oldestAge =0;
        String oldestPerson = "";
        for(int i =0; i<peopleArray.length; i++){
            Person person = new Person();
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = sc.nextInt();
            sc.nextLine();

            person.setName(name);
            person.setAge(age);
            peopleArray[i] = person;

            sum += person.getAge();
            if(oldestAge<person.getAge()){
                oldestAge = person.getAge();
                oldestPerson = person.getName();
            }
        }
        System.out.println(Arrays.toString(peopleArray));
        double averageAge = sum/ peopleArray.length;
        System.out.println("평균나이: "+averageAge);

        for(int i =0; i<peopleArray.length; i++){
            if(averageAge<peopleArray[i].getAge()){
                System.out.println(peopleArray[i].getName());
            }
        }

    }
}
