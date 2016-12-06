package com.company;

import java.util.*;


public class Manager implements LeagueManager {

    Set <SockerPlayer> players = new HashSet<>();


    @Override
    public void addPlayer(SockerPlayer player) {
        players.add(player);
    }

    @Override
    public void removePlayer(SockerPlayer player) {
        players.remove(player);

    }

    @Override
    public SockerPlayer getPlayer(String name) {
        Iterator<SockerPlayer> iter = players.iterator();
        while(iter.hasNext()) {
            if (iter.next().getNickName().equals(name)) {
                return iter.next();
            }
        }
        return null;
    }

    @Override
    public Set getAllPlayers() {
       return players;
    }


    @Override
    public<T extends Enum<T>> Set getPlayers(T t) {
        Set<SockerPlayer> sockerPlayers = new TreeSet<>();
        Iterator<SockerPlayer> iter = players.iterator();
        SockerPlayer player;
        while(iter.hasNext()) {
            player = iter.next();
            if (t instanceof Country) {
                if (player.getCountry().equals(t)) {
                    sockerPlayers.add(player);
                }
            }
            if (t instanceof League) {
                if (player.getLeague().equals(t)) {
                    sockerPlayers.add(player);
                }
            }
        }

        return sockerPlayers;
    }

    @Override
    public void addPoints(String name, int points) {
        Iterator<SockerPlayer> iter = players.iterator();
        SockerPlayer player;
        while(iter.hasNext()) {
            player = iter.next();
            if (player.getNickName().equals(name)) {
                player.setPoints(points);
            }
        }
    }
}
