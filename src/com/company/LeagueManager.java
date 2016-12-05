package com.company;

import java.util.Set;

public interface LeagueManager {
    void addPlayer(SockerPlayer player);
    void removePlayer(SockerPlayer player);
    SockerPlayer getPlayer(String name);
    Set getAllPlayers();
    <T extends Enum<T>> Set getPlayers(T t);
    void addPoints(String name, int points);
}
