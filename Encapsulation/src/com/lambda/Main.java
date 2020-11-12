package com.lambda;

public class Main {

    public static void main(String[] args) {

//	    Player player = new Player();
//	    player.name = "Cam";
////	    player.health = 20;
//	    player.weapon = "Mace";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Cam", 50, "Mace");
		System.out.println("Initial health is " + player.getHealth());
    }
}
