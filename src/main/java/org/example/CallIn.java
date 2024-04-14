package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CallIn {

  public static String reverseThis(String value) {
    char[] chars = value.toCharArray();
    List<Character> toReverse = new ArrayList<>();
    for (char one : chars) {
      toReverse.add(one);
    }
    Collections.reverse(toReverse);
    StringBuilder build = new StringBuilder();
    for (Character ones : toReverse) {
      build.append(ones);
    }
    return build.toString();
  }

  public static LinkedNumbers addToList(String numbers) {
    LinkedNumbers start = new LinkedNumbers();
    var current = start;
    for (int i = 0; i < numbers.length(); i++) {
      current.value = Integer.parseInt(String.valueOf(numbers.charAt(i)));
      current.next = i < (numbers.length() - 1) ? new LinkedNumbers() : null;
      current = current.next;
    }
    return start;
  }

  public static void printNodes(LinkedNumbers number) {
    StringBuilder buildResult = new StringBuilder();
    var current = number;
    while (Objects.nonNull(current)) {
      buildResult.append(current.value);
      current = current.next;
    }
    System.out.println(buildResult.toString());
  }

  public static LinkedNumbers sum(LinkedNumbers numOne, LinkedNumbers numTwo) {
    LinkedNumbers result = new LinkedNumbers();
    var passedOne = numOne;
    var passedTwo = numTwo;
    var current = result;
    int residue = 0;
    while (Objects.nonNull(passedOne) || Objects.nonNull(passedTwo)) {
      int numsOne = Objects.nonNull(passedOne) ? passedOne.value : 0;
      int numsTwo = Objects.nonNull(passedTwo) ? passedTwo.value : 0;
      int sum = numsOne + numsTwo + residue;
      if (sum >= 10) {
        residue = 1;
        sum -= 10;
        current.value = sum;
      } else {
        current.value = sum;
        residue = 0;
      }
      passedOne = Objects.nonNull(passedOne) ? passedOne.next : passedOne;
      passedTwo = Objects.nonNull(passedTwo) ? passedTwo.next : passedTwo;
      if (Objects.nonNull(passedOne) || Objects.nonNull(passedTwo)) {
        current.next = new LinkedNumbers();
        current = current.next;
      } else {
        break;
      }
    }

    if (residue > 0)
      current.next = new LinkedNumbers();

    return result;
  }

}
