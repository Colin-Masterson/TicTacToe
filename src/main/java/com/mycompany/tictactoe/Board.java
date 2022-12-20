/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tictactoe;

import java.util.HashMap;

/**
 *
 * @author colin
 */
public class Board {

    private String[] board;
    private String winner;
    private String turn;

    public Board() {
        this.board = new String[9];
        this.winner = null;

        this.turn = "X";

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    private void changeTurn() {
        if (this.turn.equals("X")) {
            this.turn = "O";
        } else {

            this.turn = "X";
        }
    }

    private void checkWinner() {

        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                this.winner = "X";
            } // For O winner
            else if (line.equals("OOO")) {
                this.winner = "O";
            }
        }
    }

    public String getWinner() {
        return winner;
    }

    public String getTurn() {
        return turn;
    }

    public void placeToken(int tile) {
        if (!(board[tile - 1].equals("X") || board[tile - 1].equals("O"))) {
            board[tile - 1] = this.turn;
            this.changeTurn();
            this.checkWinner();
        } else {
            System.out.println("Tile taken select another!");
        }
    }

    public void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }

}
