package com.lambda;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        League<Team<BaseballPlayer>> baseballLeague = new League<>("PCL");

        Team<FootballPlayer> seahawks = new Team<>("Seahawks");
        Team<FootballPlayer> oakland = new Team<>("Raiders");
        Team<FootballPlayer> buffalo = new Team<>("Bills");
        Team<FootballPlayer> kc = new Team<>("Chiefs");

        buffalo.matchResult(kc, 3, 1);
        buffalo.matchResult(oakland, 3, 8);
        oakland.matchResult(kc,2, 1);
        
        footballLeague.add(seahawks);
        footballLeague.add(oakland);
        footballLeague.add(buffalo);
        footballLeague.add(kc);

        footballLeague.showLeagueTable();
    }
}
