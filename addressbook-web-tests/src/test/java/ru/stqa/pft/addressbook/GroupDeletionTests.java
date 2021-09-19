package ru.stqa.pft.addressbook;


import org.openqa.selenium.By;
import org.testng.annotations.*;


public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletionTests() {
    gotoGroupPage("groups");
    selectGroup("selected[]");
    deleteSelectGroup("delete");
    returnToGroupPage(By.linkText("groups"), By.linkText("Logout"));
  }

}


