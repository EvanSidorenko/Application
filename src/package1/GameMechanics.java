package package1;

import java.io.File;
import java.util.*;

public class GameMechanics {
    public static void main(String[] args) {
        Greeting.userGreeting();

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

        System.out.println("В трех раундах каждый участник бросает кубик по одному разу. Ты бросаешь первый.");
        System.out.println("Приступим же к первому раунду!");
        System.out.println("Тап на Enter для броска");

        pressEnter.nextLine();

        Random random = new Random();
        Player.firstRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.firstRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();

        ArrayList<Integer> opponentFirstRoundResult = new ArrayList<>();
        int a = 0;
        while (a < Opponents.numberOfOppenents) {
            opponentFirstRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(inputOpponents + " получилось в первом раунде: " + opponentFirstRoundResult.get(a));
            a++;
        }

        /*System.out.println("Второй раунд. Твой бросок. Нажми Enter");
        pressEnter.nextLine();
        Player.secoundRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.secoundRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();

        ArrayList<Integer> opponentSecondRoundResult = new ArrayList<>();
        int b = 0;
        while (b < Opponents.numberOfOppenents) {
            opponentSecondRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(newOpponents.get(b) + " получилось в втором раунде: " + opponentSecondRoundResult.get(b));
            b++;
        }

        System.out.println("Третий раунд. Твой бросок. Нажми Enter");
        pressEnter.nextLine();

        Opponents.thirdRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + player.thirdRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        keyboard.nextLine();

        ArrayList<Integer> opponentThirdRoundResult = new ArrayList<>();
        int c = 0;
        while (c < players.number) {
            opponentThirdRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(newOpponents.get(c) + " получилось в третьем раунде: " + opponentThirdRoundResult.get(c));
            c++;
        }
        System.out.println("Вот и все! Определяем победителей!");
        System.out.println("Нажми Enter для продолжения");
        keyboard.nextLine();

        player.playerResults = player.firstRoundResult + player.secoundRoundResult + player.thirdRoundResult;
        System.out.println("Твой результат " + player.playerResults);

        ArrayList<Integer> opponentsResults = new ArrayList<>();
        int d = 0;
        while (d < players.number) {
            opponentsResults.add(d, opponentFirstRoundResult.get(d) + opponentSecondRoundResult.get(d) + opponentThirdRoundResult.get(d));
            System.out.println(newOpponents.get(d) + " результат за три раунда: " + opponentFirstRoundResult.get(d) + opponentSecondRoundResult.get(d) + opponentThirdRoundResult.get(d));

            int opponentBest = 0;
            int maxResult =  opponentsResults.get(opponentBest);
            for (int f = 0; f < players.number; f++ ) {
                if (opponentsResults.get(f) > maxResult) {
                    opponentBest = opponentsResults.get(f);
                    opponentBest = f;
                }
            }

            if (player.playerResults > opponentsResults.get(opponentBest)) {
                System.out.println(player.name + " Ты победил!Поздравляем! Твой результат:" + player.playerResults);
            } else {
                System.out.println("Победил" + newOpponents.get(opponentBest) + "с результатом: " + newOpponents.get(maxResult));
            }
        }*/
    }
}



