package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.GroupDate;


public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage("groups");
    app.initGroupCreation("new");
    app.fillGroupForm(new GroupDate("test2", "tstst", "tst"));
    app.submitGroupCreation("submit");
    app.returnToGroupPage(By.linkText("groups"), By.linkText("Logout"));
  }

}
