/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tictactoe;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class UserInterface {

    private Scanner scanner;
    private Board board;

    public UserInterface(Scanner scanner, Board board) {
        this.scanner = scanner;

        this.board = board;
    }

    public void start() {

        System.out.println("Welcome to TicTacToe here is the board: ");
        System.out.println("");
        board.printBoard();

        while (board.getWinner() == null) {
            System.out.println("");
            System.out.println("It is Player " + this.board.getTurn() + "'s turn input a number on the board to place your token");
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 1 || input > 9) {
                System.out.println("");
                System.out.println("Input a number available on the board (1-9)");
                continue;
            }

            board.placeToken(input);
            System.out.println("");
            board.printBoard();
            System.out.println("");
        }

        System.out.println("Congrats Player " + board.getWinner() + " you have won!!");
        System.out.println("Winning board:");
        System.out.println("");
        board.printBoard();
    }

}
