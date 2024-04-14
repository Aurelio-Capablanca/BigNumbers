package org.example;

import java.util.Objects;

public class LinkedNumbers {

  public int value;
  public LinkedNumbers next;

  public LinkedNumbers(int value, LinkedNumbers next) {
    this.value = value;
    this.next = next;
  }
  public LinkedNumbers(){}

}
