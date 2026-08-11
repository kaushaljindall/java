package questions.arrays;

import java.util.Random;

public class ques7 {
    public static void main(String[] args) {

        Random rand = new Random();

        String[][] board = new String[5][4];
        boolean[][] visited = new boolean[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                int x = rand.nextInt(3);

                if (x == 0)
                    board[i][j] = "1";
                else if (x == 1)
                    board[i][j] = "*";
                else
                    board[i][j] = "";
            }
        }

        int score = 0;
        String currentValue = "1";
        int visitedCount = 0;

        while (visitedCount < 20) {

            int row, col;
            do {
                row = rand.nextInt(5);
                col = rand.nextInt(4);
            } while (visited[row][col]);

            visited[row][col] = true;
            visitedCount++;

            if (board[row][col].equals("*")) {
                System.out.println("Final Score : " + score);
                break;
            }

            int count = 0;

            for (int i = 0; i < 5; i++) {
                if (board[i][col].equals(currentValue))
                    count++;
            }

            score += count;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {

                    if (board[i][j].equals(currentValue))
                        board[i][j] = String.valueOf(score);
                }
            }

            currentValue = String.valueOf(score);

            System.out.println("Score = " + score);
        }

        if (visitedCount == 20) {
            System.out.println("\nAll cells visited.");
            System.out.println("Final Score : " + score);
        }
    }
}
