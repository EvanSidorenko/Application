package package1;

import java.util.*;
public class LoadOpponents {
    public static void scanFileAndMakeListOfOpponents() {
        ReadFile readFile = new ReadFile();
        Scanner pressEnter = new Scanner(System.in);
        System.out.println("Нажми Enter для того, чтобы сесть за виртуальный стол!");
        pressEnter.nextLine();

        System.out.println("Отлично, вот ты и за столом!");
        System.out.println("Теперь, нужно выбрать количество оппонентов от 2 до 5:");
    }
}


