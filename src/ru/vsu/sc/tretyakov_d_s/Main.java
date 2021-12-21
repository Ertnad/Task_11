package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String str = readString();
    NumberTransform transform;

    if (checkStringForNumbers(str)) {

      int arabic = Integer.parseInt(str);

      try {
        transform = new NumberTransform(arabic);
        printTransformResult(transform, str);
      } catch (NumberFormatException e) {
        printErrorMessage(e);
      }

    } else {

      try {
        transform = new NumberTransform(str);
        printTransformResult(transform, str);
      } catch (NumberFormatException e) {
        printErrorMessage(e);
      }

    }
  }

  private static boolean checkStringForNumbers(String string) {
    return string.matches(".*\\d+.*");
  }

  private static String readString () {
    System.out.print("Write a Roman or Arabic numeral: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private static void printErrorMessage (NumberFormatException e) {
    System.out.println("Invalid input.");
    System.out.println(e.getMessage());
  }

  private static void printTransformResult (NumberTransform transform, String string) {

    if(checkStringForNumbers(string)) {
    System.out.println(transform.toInt() + " = " + transform);
    } else {
      System.out.println(transform + " = " + transform.toInt());
    }

  }

}
