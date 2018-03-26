package com.AnthonyDombrowski;

import java.util.List;

public class League {
  private int numberOfDivisions;
  private int name;
  private List<Division> divisionList;

  public League(final int numberOfDivisions,
                final int name,
                final List<Division> divisionList) {
    this.numberOfDivisions = numberOfDivisions;
    this.name = name;
    this.divisionList = divisionList;
  }

  public int getNumberOfDivisions() {
    return numberOfDivisions;
  }

  public void setNumberOfDivisions(final int numberOfDivisions) {
    this.numberOfDivisions = numberOfDivisions;
  }

  public int getName() {
    return name;
  }

  public void setName(final int name) {
    this.name = name;
  }

  public List<Division> getDivisionList() {
    return divisionList;
  }

  public void setDivisionList(final List<Division> divisionList) {
    this.divisionList = divisionList;
  }
}
