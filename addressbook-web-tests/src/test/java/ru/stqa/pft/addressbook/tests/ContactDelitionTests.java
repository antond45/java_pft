package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class ContactDelitionTests extends TestBaseCont{


  @Test
  public void testContactDelition() throws Exception {
    delitedCont();
    wd.findElement(By.linkText("Logout")).click();
  }


}
