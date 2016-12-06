package com.company;

import java.util.Random;
import java.util.Set;

public class Main {

    public static <T extends Enum <T> > void output(Class <T> enumType, Manager manager) {
        for (T c : enumType.getEnumConstants()) {
            Set<SockerPlayer> list1 = manager.getPlayers(c);
            System.out.println("\n" + c);
            for (SockerPlayer p : list1) {
                System.out.println(p.getNickName() + " " + p.getPoints() + " " + p.getCountry() + " " + p.getLeague());
            }
        }

    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        Random random = new Random();
        int r;
        int k = 1;
        int points;
        for (int i = 0; i < Country.values().length; i++) {
            for (int j = 0; j < League.values().length; j++) {
                r = random.nextInt(10);
                for (int l = 0; l < r; l++) {
                    points = random.nextInt(100);
                    manager.addPlayer(new Player("player" + k, points, League.values()[j], Country.values()[i]));
                    k++;
                }
            }
        }
        manager.addPlayer(new Player("player1", 100, League.ПЕРВАЯ, Country.GREECE)); //не будет добавлен
        manager.addPoints("player1",150);


        output(Country.class, manager);
        output(League.class, manager);
    }
}
