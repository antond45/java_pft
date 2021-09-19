package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;


public class ContactCreationTests extends TestBaseCont {


  @Test
  public void testContactCreation() {

    creatNewTap();
    creatNewCont();
    stop();
  }

}
