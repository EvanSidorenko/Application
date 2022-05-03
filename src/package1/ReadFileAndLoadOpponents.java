package package1;

import java.io.File;
import java.util.*;
public class ReadFileAndLoadOpponents {
    public static void scanFileAndMakeListOfOpponents() {
        Scanner pressEnter = new Scanner(System.in);
        System.out.println("Нажми Enter для того, чтобы сесть за виртуальный стол!");
        pressEnter.nextLine();

        System.out.println("Отлично, вот ты и за столом!");
        System.out.println("Теперь, нужно выбрать количество оппонентов от 2 до 5:");
        while (true) {
            Scanner opponentsScan = new Scanner(System.in);
            Opponents.numberOfOppenents = opponentsScan.nextInt();
            try {
                if (Opponents.numberOfOppenents < 2 | Opponents.numberOfOppenents > 5) {
                    System.out.println("Пожалуйста, введи количество от 2 до 5...");
                } else if (Opponents.numberOfOppenents >= 2 | Opponents.numberOfOppenents <= 5) {

                    File file = new File("opponents.txt");
                    try {
                        Scanner fileScanner = new Scanner(file);
                        String scanOpponents = fileScanner.nextLine();
                        String[] arrayOpponents = scanOpponents.split(" ");

                        List<String> listOpponents = Arrays.asList(arrayOpponents);
                        Collections.shuffle(listOpponents);
                        ArrayList<String> inputOpponents = new ArrayList<>();

                        int i = 0;
                        while (Opponents.numberOfOppenents > i) {
                            inputOpponents.add(arrayOpponents[i]);

                            System.out.println("Ты играешь против: " + arrayOpponents[i]);
                            i++;
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


