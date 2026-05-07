package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
  @Test
  public void testOne() {
    assertEquals(5, App.add(2,3));
  }

  @Test
  public void testTwo() {
    App app = new App();
    assertNotNull(app);
  }
}
