package package1;

import java.util.*;
public class EnterOpponentsAndReadFIleWIthOpponents {
    public static void enterNumberOfOpponents() {

        Scanner pressEnter = new Scanner(System.in);
        System.out.println("Нажми Enter для того, чтобы сесть за виртуальный стол!");
        pressEnter.nextLine();

        System.out.println("Отлично, вот ты и за столом!");
        System.out.println("Теперь, нужно выбрать количество оппонентов от 2 до 5:");
        Scanner opponentsScan = new Scanner(System.in);

        Opponents.numberOfOpponents = opponentsScan.nextInt();
        FileWithOpponents file = new FileWithOpponents();
        int i = 0;
        while (true) {
            try {
                if (Opponents.numberOfOpponents < 2 | Opponents.numberOfOpponents > 5) {
                    System.out.println("Пожалуйста, введи количество от 2 до 5...");
                } else if (Opponents.numberOfOpponents >= 2 | Opponents.numberOfOpponents <= 5) {
                    try {
                        while (Opponents.numberOfOpponents > i) {
                            System.out.println("Ты играешь против " + Opponents.numberOfOpponents + " игроков:");
                            file.readFile();
                            break;
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



