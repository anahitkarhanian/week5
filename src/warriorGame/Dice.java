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

        if (diceSide == 1){
            for (int i = 0; i < dice1.length; i++) {
                for (int j = 0; j < dice1[i].length; j++) {
                    System.out.print(dice1[i][j]);
                }
                System.out.println();
            }
            return 1;
        } else if (diceSide == 2){
            for (int i = 0; i < dice2.length; i++) {
                for (int j = 0; j < dice2[i].length; j++) {
                    System.out.print(dice2[i][j]);
                }
                System.out.println();
            }
            return 2;
        } else if (diceSide == 3){
            for (int i = 0; i < dice3.length; i++) {
                for (int j = 0; j < dice3[i].length; j++) {
                    System.out.print(dice3[i][j]);
                }
                System.out.println();
            }
            return 3;
        } else if (diceSide == 4){
            for (int i = 0; i < dice4.length; i++) {
                for (int j = 0; j < dice4[i].length; j++) {
                    System.out.print(dice4[i][j]);
                }
                System.out.println();
            }
            return 4;
        } else if (diceSide == 5){
            for (int i = 0; i < dice5.length; i++) {
                for (int j = 0; j < dice5[i].length; j++) {
                    System.out.print(dice5[i][j]);
                }
                System.out.println();
            }
            return 5;
        } else {
            for (int i = 0; i < dice6.length; i++) {
                for (int j = 0; j < dice6[i].length; j++) {
                    System.out.print(dice6[i][j]);
                }
                System.out.println();
            }
            return 6;
        }
    }
}
