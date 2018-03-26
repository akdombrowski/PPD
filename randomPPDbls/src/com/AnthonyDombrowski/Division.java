package com.AnthonyDombrowski;

import java.util.List;

public class Division {
  private String name;
  private Division divisionAbove;
  private Division divisionBelow;
  private List<Player> playerList;

  public Division(final String name) {
    this.name = name;
  }

  public Division(final String name,
           final Division divisionAbove,
           final Division divisionBelow) {
    this.name = name;
    this.divisionAbove = divisionAbove;
    this.divisionBelow = divisionBelow;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Division getDivisionAbove() {
    return divisionAbove;
  }

  public void setDivisionAbove(final Division divisionAbove) {
    this.divisionAbove = divisionAbove;
  }

  public Division getDivisionBelow() {
    return divisionBelow;
  }

  public void setDivisionBelow(final Division divisionBelow) {
    this.divisionBelow = divisionBelow;
  }
}
