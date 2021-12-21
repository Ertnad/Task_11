package ru.vsu.sc.tretyakov_d_s;

import static java.lang.String.*;

public class NumberTransform {

  private final int num;

  private static final int[] numbers = {
      1000,900,500,400,100,90,50,40,10,9,5,4,1
  };

  private static final String[] letters = {
      "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
  };

  public NumberTransform(int arabic) throws NumberFormatException {

    if (arabic<1) {
      throw new NumberFormatException("Value of Roman numeral must be positive.");
    }
    if (arabic>3999) {
      throw new NumberFormatException("Value of Roman numeral must be 3999 or less.");
    }
    num = arabic;
  }

  public NumberTransform(String roman) {

    if (roman.length() == 0) {
      throw new NumberFormatException("An empty string does not define a Roman numeral.");
    }

    roman = roman.toUpperCase();

    int i = 0;
    int arabic = 0;

    while (i<roman.length()) {

      String letter = valueOf(roman.charAt(i));
      int number = letterToNumber(letter);
      i++;

      if (i == roman.length()) {

        arabic+=number;

      }

      else{

        int nextNumber=letterToNumber(valueOf(roman.charAt(i)));
        if (nextNumber>number) {

          arabic+=(nextNumber-number);
          i++;

        }
        else {

          arabic+=number;

        }
      }

    }

    if (arabic > 3999){
      throw new NumberFormatException("Roman numeral must have value 3999 or less.");
    }

    num = arabic;

  }

  private int letterToNumber (String letter) {
    return switch (letter) {
      case "I" -> 1;
      case "V" -> 5;
      case "X" -> 10;
      case "L" -> 50;
      case "C" -> 100;
      case "D" -> 500;
      case "M" -> 1000;
      default -> -1;
    };
  }

  public String toString(){

    StringBuilder roman = new StringBuilder();
    int N =num;

    for(int i = 0; i < numbers.length; i++) {
      while( N >= numbers[i] ){
        roman.append(letters[i]);
        N -= numbers[i];
      }
    }

    return roman.toString();
  }

  public int toInt(){
    return num;
  }

}