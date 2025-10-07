package com.app.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.app.model.Calculator;

public class CalculatorTest {

  @Test
  public void testAdd() {
    assertEquals(8, Calculator.add(3, 5));
  }

  @Test
  public void testSub() {
    assertEquals(-2, Calculator.sub(3, 5));
  }

  @Test
  public void testMul() {
    assertEquals(15, Calculator.mul(3, 5));
  }

  @Test
  public void testDiv() {
    assertEquals(2, Calculator.div(10, 5));
  }
}
