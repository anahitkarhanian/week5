package warriorGame;

import java.util.Random;

public class Dice {
    public static int getDice(){
        Random random = new Random();
        int diceSide = 1 + random.nextInt(6);

        String[][] dice1 = {{" 0 "," 0 "," 0 "},{" 0 "," * ", " 0 "},{" 0 "," 0 "," 0 "}};
        String[][] dice2 = {{" * "," 0 "," 0 "},{" 0 "," 0 ", " 0 "},{" 0 "," 0 "," * "}};
        String[][] dice3 = {{" * "," 0 "," 0 "},{" 0 "," * ", " 0 "},{" 0 "," 0 "," * "}};
        String[][] dice4 = {{" * "," 0 "," * "},{" 0 "," 0 ", " 0 "},{" * "," 0 "," * "}};
        String[][] dice5 = {{" * "," 0 "," * "},{" 0 "," * ", " 0 "},{" * "," 0 "," * "}};
        String[][] dice6 = {{" * "," 0 "," * "},{" * "," 0 ", " * "},{" * "," 0 "," * "}};

        switch (diceSide) {
            case 1:
                printMatrix(dice1);
                return 1;
            case 2:
                printMatrix(dice2);
                return 2;
            case 3:
                printMatrix(dice3);
                return 3;
            case 4:
                printMatrix(dice4);
                return 4;
            case 5:
                printMatrix(dice5);
                return 5;
            default:
                printMatrix(dice6);
                return 6;
        }
    }

    private static void printMatrix(String[][] dice1) {
        for (int i = 0; i < dice1.length; i++) {
            for (int j = 0; j < dice1[i].length; j++) {
                System.out.print(dice1[i][j]);
            }
            System.out.println();
        }
    }
}
