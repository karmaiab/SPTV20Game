/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //программа загадывает число и просит пользователя отгадать
        //Если пользователь отгадал, он выйграл
        //Иначе пользователь проиграл
        int max = 5, min = 0;
        Random random = new Random();
        int gameNum = random.nextInt(max - min + 1) + min;
        System.out.println("Programm made up a number from 0 to 5, guess: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(gameNum == userNum) {
            System.out.println("Yay! You won!");
        }else{
            System.out.println(":( You lost! The number is: " +gameNum);
        }
    }
    
}
