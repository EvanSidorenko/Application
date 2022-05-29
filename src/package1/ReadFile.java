package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class ReadFile {
    public void readFile() throws FileNotFoundException {
        File file = new File("opponents.txt");

        Scanner fileScanner = new Scanner(file);
        String scanOpponents = fileScanner.nextLine();
        String[] arrayOpponents = scanOpponents.split(" ");

        List<String> listOpponents = Arrays.asList(arrayOpponents);
        Collections.shuffle(listOpponents);
        ArrayList<String> listOfOpponents = new ArrayList<>();
    }
    public void scanFile() {
        Scanner pressEnter = new Scanner(System.in);
        int i = 0;

        while (true) {
            Scanner opponentsScan = new Scanner(System.in);
            Opponents.numberOfOpponents = opponentsScan.nextInt();
            try {
                if (Opponents.numberOfOpponents < 2 | Opponents.numberOfOpponents > 5) {
                    System.out.println("Пожалуйста, введи количество от 2 до 5...");
                } else if (Opponents.numberOfOpponents >= 2 | Opponents.numberOfOpponents <= 5) {
                    try {
                        while (Opponents.numberOfOpponents > i) {

                        }
                    } catch (Exception e) {
                        System.out.println("Пожалуйста, введи число, а не текст.");
                    }
                    System.out.println("Нажми Enter, чтобы продлжить...!");
                    pressEnter.nextLine();
                    break;
                }
            } catch (Exception e) {
                System.err.println("Упс! Что-то пошло не так! Можно пожаловаться разработчику сюда: hzWhatHappened@notSureIllFixIt.com");
                System.exit(1);
            }
        }
    }
}
