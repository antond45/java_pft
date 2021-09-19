package ru.stqa.pft.addressbook.model;

public class GroupDate {
  private final String name;
  private final String heder;
  private final String footer;

  public GroupDate(String name, String heder, String footer) {
    this.name = name;
    this.heder = heder;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }

  public String getHeder() {
    return heder;
  }

  public String getFooter() {
    return footer;
  }
}
