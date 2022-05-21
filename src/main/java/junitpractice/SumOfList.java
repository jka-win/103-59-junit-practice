package junitpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter integers for the list, or 0 to stop:");

      var list = new ArrayList<Integer>();
      while (true) {
        Integer item = Integer.valueOf(scanner.nextLine());
        if (item == 0) {
          break;
        } else {
          list.add(item);
        }
      }

      if (list.size() == 0) {
        System.out.print("There were no items in the list.");
      } else if (list.size() == 1) {
        System.out.print("%d was the item in the list.".formatted(list.get(0)));
      } else if (list.size() == 2) {
        System.out.print("%d and %d were the items in the list.".formatted(list.get(0), list.get(1)));
      } else {
        for (int i = 0; i < list.size() - 1; i++) {
          System.out.print("%d, ".formatted(list.get(i)));
        }
        System.out.print("and %d were the items in the list.".formatted(list.get(list.size() - 1)));
      }

      System.out.println(" The sum of that list is: " + sum(list));
    }
  }

  public static int sum(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer item : list) {
      sum += item;
    }
    return sum;
  }
}
