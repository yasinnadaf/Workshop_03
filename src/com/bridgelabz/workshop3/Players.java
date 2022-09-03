package com.bridgelabz.workshop3;

import java.util.Scanner;

public class Players {

    void players(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players(2,4): ");
        int numOfPlayers = sc.nextInt();
        if(numOfPlayers >= 2 && numOfPlayers <= 4){
            System.out.println(numOfPlayers+ " players will play the game");
        }
        else
            System.out.println("Please enter number of players in range");
    }
}
