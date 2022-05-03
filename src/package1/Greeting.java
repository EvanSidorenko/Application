package package1;

import java.util.Scanner;

public class Greeting {
    public static void userGreeting() {
        System.out.println("Привет! Для игры в казино укажи свой возраст: ");
        while (true) {
            try {
                Scanner userAge = new Scanner(System.in);
                Player.age = Integer.parseInt(userAge.next());
                if (Player.age < 18) {
                    System.out.println("Извини, несовершеннолетним в казино нельзя.");
                    System.exit(1);
                } else if (Player.age > 90) {
                    System.out.println("Извини, в таком возрасте нельзя играть в казино. ");
                    System.exit(1);
                } else if (Player.age >= 18 | Player.age <= 90) {
                    Scanner scanUserNameAndSex = new Scanner(System.in);
                    System.out.println("Отлично!Давай знакомиться! Укажи имя:");
                    Player.name = scanUserNameAndSex.nextLine();
                    System.out.println("Приятно познакомиться, " + Player.name + " !");

                    System.out.println("Последний вопрос! Укажи свой пол (М/Ж):");
                    Player.sex = scanUserNameAndSex.nextLine();
                    System.out.println("Добро пожаловать, " + Player.name + "!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите число.");
            }
        }
    }
}
