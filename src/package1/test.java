package package1;

import java.util.Scanner;

import static package1.Player.age;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            age = sc.nextInt();
        } while (age <= 0);
        System.out.println("Thank you! Got " + age);
    }
}
