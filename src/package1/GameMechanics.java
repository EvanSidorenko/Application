package package1;

import java.util.*;

public class GameMechanics {
    public static void main(String[] args) {
        Greeting.userGreeting();
        LoadOpponents.scanFileAndMakeListOfOpponents();
        ReadFile.scanFile();

        //Start 3 rounds
        Scanner pressEnter = new Scanner(System.in);
        System.out.println("В трех раундах каждый участник бросает кубик по одному разу. Ты бросаешь первый.");
        System.out.println("Приступим же к первому раунду!");
        System.out.println("Тап на Enter для броска");

        pressEnter.nextLine();

        Player.firstRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.firstRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();


        ArrayList<Integer> opponentFirstRoundResult = new ArrayList<>();

      /*  int a = 0;
        while (a < Opponents.numberOfOpponents) {
            opponentFirstRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(inputOpponents.get(a) + " получилось в первом раунде: " + opponentFirstRoundResult.get(a));
            a++;
        }

        System.out.println("Второй раунд. Твой бросок. Нажми Enter");
        keyboard.nextLine();
        player.secoundRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + player.secoundRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        keyboard.nextLine();

        ArrayList<Integer> opponentSecondRoundResult = new ArrayList<>();
        int b = 0;
        while (b < players.number) {
            opponentSecondRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(newOpponents.get(b) + " получилось в втором раунде: " + opponentSecondRoundResult.get(b));
            b++;
        }

        System.out.println("Третий раунд. Твой бросок. Нажми Enter");
        keyboard.nextLine();

        player.thirdRoundResult = (int) Math.round((Math.random() * 100));
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

        ArrayList<Integer> opponentsSummResults = new ArrayList<>();
        int d = 0;
        while (d < players.number) {
            opponentsSummResults.add(d, opponentFirstRoundResult.get(d) + opponentSecondRoundResult.get(d) + opponentThirdRoundResult.get(d));
            System.out.println(newOpponents.get(d) + " результат за три раунда: " + opponentFirstRoundResult.get(d) + "+" + opponentSecondRoundResult.get(d) + "+" + opponentThirdRoundResult.get(d));
            d++;
        }
        int opponentBest = 0;
        int maxResult =  opponentsSummResults.get(opponentBest);
        for (int f = 1; f < players.number; f++ ) {
            if (opponentsSummResults.get(f) > maxResult) {
                maxResult = opponentsSummResults.get(f);
                opponentBest = f;
            }
        }

        if (player.playerResults > opponentsSummResults.get(opponentBest)) {
            System.out.println(player.name + ", ты победил! Поздравляем! Твой результат:" + player.playerResults);
        } else {
            System.out.println("Победил(а) " + newOpponents.get(opponentBest)   + " с результатом: " +  opponentsSummResults.get(opponentBest));
        }

    } else {
        System.out.println("Введено неверное количество соперников");
    }*/
}
}




