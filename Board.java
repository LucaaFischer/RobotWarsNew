package com.btcag.bootcamp;

public class Board {
    protected static void drawBoard(Robot[] robots) {
        int y = 1;
        System.out.print("      ");
        for(int i = 1; i <= 15; i++) {
            String xOut;
            xOut = String.valueOf(i);
            while(xOut.length() < 7) {
                xOut += " ";
            }
            System.out.print(xOut);
        }
        System.out.println();
        String yOut = "";
        while (y <= 15) {
            yOut = String.valueOf(y);
            while(yOut.length() < 3) {
                yOut += " ";
            }
            System.out.print(yOut);
            int x = 1;
            while (x <= 15) {
                boolean isRobot = false;
                for (Robot robot : robots) {
                    if (x == robot.x && y == robot.y) {
                        System.out.print(" [  " + robot.avatar + "] ");
                        isRobot = true;
                    }
                }
                if(!isRobot) {
                    System.out.print(" [   ] ");
                }
                x++;
            }
            System.out.println();
            System.out.println();
            y++;
        }
    }
}