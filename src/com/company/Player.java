package com.company;

import java.util.Comparator;
import java.util.Set;

/**
 * Created by tyuly on 04.12.2016.
 */
public class Player implements SockerPlayer, Comparable<Player> {
    private String nickName;
    private int points;
    private League league;
    private Country country;

    Player(String nickName, int points, League league, Country country) {
        this.nickName = nickName;
        this.points = points;
        this.league = league;
        this.country = country;
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public Integer getPoints() {
        return points;
    }

    @Override
    public League getLeague() {
        return league;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public void setPoints(int points) {
        this.points += points;

    }

    @Override
    public int hashCode () {
        return nickName.hashCode();
    }


    @Override
    public boolean equals(Object other) {
        Player otherPlayer = (Player) other;
        return this.getNickName().equals(otherPlayer.getNickName());
    }

    @Override
    public int compareTo(Player o) {
        return o.getPoints().compareTo(this.getPoints());
    }

}
