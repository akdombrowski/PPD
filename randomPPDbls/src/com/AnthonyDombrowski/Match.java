package com.AnthonyDombrowski;

import java.util.Date;
import java.util.List;

public class Match {
  private List<Player> homeTeamPlayerList;
  private List<Player> awayTeamPlayerList;

  public Date getDateCompleted() {
    return dateCompleted;
  }

  public void setDateCompleted(final Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  public static int getGamesPerMatch() {
    return GAMES_PER_MATCH;
  }

  public static void setGamesPerMatch(final int gamesPerMatch) {
    GAMES_PER_MATCH = gamesPerMatch;
  }

  private Date dateCompleted;
  private static int GAMES_PER_MATCH = 3;

  public Match(final List<Player> homeTeamPlayerList,
               final List<Player> awayTeamPlayerList) {
    this.homeTeamPlayerList = homeTeamPlayerList;
    this.awayTeamPlayerList = awayTeamPlayerList;
  }

  public Match(final List<Player> homeTeamPlayerList,
               final List<Player> awayTeamPlayerList,
               final Date dateCompleted) {
    this.homeTeamPlayerList = homeTeamPlayerList;
    this.awayTeamPlayerList = awayTeamPlayerList;
    this.dateCompleted = dateCompleted;
  }

  public List<Player> getHomeTeamPlayerList() {
    return homeTeamPlayerList;
  }

  public void setHomeTeamPlayerList(final List<Player> homeTeamPlayerList) {
    this.homeTeamPlayerList = homeTeamPlayerList;
  }

  public List<Player> getAwayTeamPlayerList() {
    return awayTeamPlayerList;
  }

  public void setAwayTeamPlayerList(final List<Player> awayTeamPlayerList) {
    this.awayTeamPlayerList = awayTeamPlayerList;
  }
}
