package ru.stqa.pft.addressbook.tests;


import org.openqa.selenium.By;
import org.testng.annotations.*;


public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletionTests() {
    app.gotoGroupPage("groups");
    app.selectGroup("selected[]");
    app.deleteSelectGroup("delete");
    app.returnToGroupPage(By.linkText("groups"), By.linkText("Logout"));
  }

}


