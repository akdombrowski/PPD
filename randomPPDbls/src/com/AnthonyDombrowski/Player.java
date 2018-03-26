package com.AnthonyDombrowski;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private String name;
  private List<Player> prevOpponents;
  private List<Player> prevTeammates;

  public Player(String name, List<Player> opponents, List<Player> teammates)
    throws Exception {
    this.name = name;
    prevOpponents = opponents;
    prevTeammates = teammates;

    /*
     * Null checks for fields
     */
    // The name can't be null as this is the identifier of the player.
    if (this.name == null) {
      throw new Exception();
    }
    if (prevOpponents == null) {
      prevOpponents = new ArrayList<Player>();
    }

    if (prevTeammates == null) {
      prevTeammates = new ArrayList<Player>();
    }
  }

  public Player(String name) throws Exception {
    this(name, null, null);
  }

  String getName() {
    return name;
  }

  void setName(final String name) {
    this.name = name;
  }

  @java.lang.Override
  public java.lang.String toString() {
    return "Player{" + "name='" + name + '\'' + ", prevOpponents=" +
           (prevOpponents.isEmpty() ? "N/A" : prevOpponents.toString()) + ", " +
           "prevTeammates=" +
           (prevTeammates.isEmpty() ? "N/A" : prevTeammates.toString()) + '}';
  }
}
