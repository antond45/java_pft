package ru.stqa.pft.addressbook;


import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage("groups");
    initGroupCreation("new");
    fillGroupForm(new GroupDate("test2", "tstst", "tst"));
    submitGroupCreation("submit");
    returnToGroupPage(By.linkText("groups"), By.linkText("Logout"));
  }

}
