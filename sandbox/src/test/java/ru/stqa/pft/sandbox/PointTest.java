package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance() {
    Point t = new Point(8, 4);
    Assert.assertEquals(t.distance(), 2);
  }
}
