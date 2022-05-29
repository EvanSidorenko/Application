package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileWithOpponents {
 static List<String> listOpponents;
 static ArrayList<String> newOpponents;
    public void readFile() throws FileNotFoundException {
        File file = new File("opponents.txt");

        Scanner fileScanner = new Scanner(file);
        String scanOpponents = fileScanner.nextLine();
        String[] arrayOpponents = scanOpponents.split(" ");

        listOpponents = Arrays.asList(arrayOpponents);
        Collections.shuffle(listOpponents);
        newOpponents = new ArrayList<>();
        int i = 0;
        while (Opponents.numberOfOpponents > i) {
            newOpponents.add(arrayOpponents[i]);
            System.out.println(arrayOpponents[i]);
            i++;
        }
    }
    }

