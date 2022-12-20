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
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        UserInterface UI = new UserInterface(scanner, board);

        UI.start();
    }

}
