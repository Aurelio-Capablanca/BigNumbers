package org.example;

import java.util.List;
import java.util.Objects;

public class Main {
  public static void main(String[] args) {
    String numberOne = "980980980808088044443234";
    String numberTwo = "7743502345523324";

    LinkedNumbers numbersOne = CallIn.addToList(CallIn.reverseThis(numberOne));
    LinkedNumbers numbersTwo = CallIn.addToList(CallIn.reverseThis(numberTwo));

    CallIn.printNodes(CallIn.sum(numbersOne,numbersTwo));

  }
}