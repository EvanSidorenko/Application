package package1;

import java.util.*;

public class GameMechanics {
    public static void main(String[] args) {

        // Start greeting and enter opponents methods
        Greeting.userGreeting();
        EnterOpponentsAndReadFIleWIthOpponents.enterNumberOfOpponents();

        //Start 3 rounds
        Scanner pressEnter = new Scanner(System.in);
        System.out.println("В трех раундах каждый участник бросает кубик по одному разу. Ты бросаешь первый.");
        System.out.println("Приступим же к первому раунду!");
        System.out.println("Тап на Enter для броска");

        pressEnter.nextLine();

        //First round
        Player.firstRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.firstRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();

        ArrayList<Integer> opponentFirstRoundResult = new ArrayList<>();

     int a = 0;
        while (a < Opponents.numberOfOpponents) {
            opponentFirstRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(FileWithOpponents.newOpponents.get(a) + " получилось в первом раунде: " + opponentFirstRoundResult.get(a));
            a++;
        }

        //Second round
        System.out.println("Второй раунд. Твой бросок. Нажми Enter");
        pressEnter.nextLine();
        Player.secoundRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.secoundRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();

        ArrayList<Integer> opponentSecondRoundResult = new ArrayList<>();
        int b = 0;
        while (b < Opponents.numberOfOpponents) {
            opponentSecondRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(FileWithOpponents.newOpponents.get(b) + " получилось в втором раунде: " + opponentSecondRoundResult.get(b));
            b++;
        }

        //Third round
        System.out.println("Третий раунд. Твой бросок. Нажми Enter");
        pressEnter.nextLine();

        Player.thirdRoundResult = (int) Math.round((Math.random() * 100));
        System.out.println("Твой результат " + Player.thirdRoundResult);

        System.out.println("Теперь очередь бросать у оппонентов. Нажми Enter.");
        pressEnter.nextLine();

        ArrayList<Integer> opponentThirdRoundResult = new ArrayList<>();
        int c = 0;
        while (c < Opponents.numberOfOpponents) {
            opponentThirdRoundResult.add((int) Math.round(Math.random() * 100));
            System.out.println(FileWithOpponents.newOpponents.get(c) + " получилось в третьем раунде: " + opponentThirdRoundResult.get(c));
            c++;
        }

        //Count results
        System.out.println("Вот и все! Определяем победителей!");
        System.out.println("Нажми Enter для продолжения");
        pressEnter.nextLine();

        Player.playerSumResults = Player.firstRoundResult + Player.secoundRoundResult + Player.thirdRoundResult;
        System.out.println("Твой результат " + Player.playerSumResults);

        ArrayList<Integer> opponentsSumResults = new ArrayList<>();
        int d = 0;
        while (d < Opponents.numberOfOpponents) {
            opponentsSumResults.add(d, opponentFirstRoundResult.get(d) + opponentSecondRoundResult.get(d) + opponentThirdRoundResult.get(d));
            System.out.println(FileWithOpponents.newOpponents.get(d) + " результат за три раунда: " + opponentFirstRoundResult.get(d) + "+" + opponentSecondRoundResult.get(d) + "+" + opponentThirdRoundResult.get(d));
            d++;
        }
        int opponentBest = 0;
        int maxResult =  opponentsSumResults.get(opponentBest);
        for (int f = 1; f < Opponents.numberOfOpponents; f++ ) {
            if (opponentsSumResults.get(f) > maxResult) {
                maxResult = opponentsSumResults.get(f);
                opponentBest = f;
            }
        }

        if (Player.playerSumResults > opponentsSumResults.get(opponentBest)) {
            System.out.println(Player.name + ", ты победил! Поздравляем! Твой результат:" + Player.playerSumResults);
        } else {
            System.out.println("Победил(а) " + FileWithOpponents.newOpponents.get(opponentBest)   + " с результатом: " +  opponentsSumResults.get(opponentBest));
        }
    }
}





