package com.AnthonyDombrowski;

import java.util.Date;

public class Game {
  private int homeTeamScore;
  private int awayTeamScore;
  private int gameNumber;
  private Date datePlayed;

  public Game(final int homeTeamScore,
              final int awayTeamScore,
              final int gameNumber,
              final Date datePlayed) {
    this.homeTeamScore = homeTeamScore;
    this.awayTeamScore = awayTeamScore;
    this.gameNumber = gameNumber;
    this.datePlayed = datePlayed;
  }

  public Game(final int gameNumber) {
    this.gameNumber = gameNumber;
  }

  public int getHomeTeamScore() {

    return homeTeamScore;
  }

  public void setHomeTeamScore(final int homeTeamScore) {
    this.homeTeamScore = homeTeamScore;
  }

  public int getAwayTeamScore() {
    return awayTeamScore;
  }

  public void setAwayTeamScore(final int awayTeamScore) {
    this.awayTeamScore = awayTeamScore;
  }

  public int getGameNumber() {
    return gameNumber;
  }

  public void setGameNumber(final int gameNumber) {
    this.gameNumber = gameNumber;
  }

  public Date getDatePlayed() {
    return datePlayed;
  }

  public void setDatePlayed(final Date datePlayed) {
    this.datePlayed = datePlayed;
  }
}
