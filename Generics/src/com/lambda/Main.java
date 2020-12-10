package com.lambda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer dave = new SoccerPlayer("Dave");

        Team<FootballPlayer> seahawks = new Team<>("Seahawks");
        seahawks.addPlayer(joe);

        System.out.println(seahawks.numPlayers());

        Team<BaseballPlayer> lefties = new Team<>("PA Lefties");
        lefties.addPlayer(pat);

        Team<SoccerPlayer> sounders = new Team<>("Sounders");
        sounders.addPlayer(dave);

        Team<FootballPlayer> oakland = new Team<>("Raiders");
        FootballPlayer stabler = new FootballPlayer("Kenny");
        oakland.addPlayer(stabler);

        Team<FootballPlayer> buffalo = new Team<>("Bills");
        Team<FootballPlayer> kc = new Team<>("Chiefs");

        buffalo.matchResult(kc, 3, 1);
        buffalo.matchResult(oakland, 3, 8);

        oakland.matchResult(kc,2, 1);
//        oakland.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(lefties.getName() + ": " + lefties.ranking());
        System.out.println(oakland.getName() + ": " + oakland.ranking());
        System.out.println(buffalo.getName() + ": " + buffalo.ranking());
        System.out.println(kc.getName() + ": " + kc.ranking());

        System.out.println(oakland.compareTo(kc));
        System.out.println(buffalo.compareTo(oakland));

    }
}
