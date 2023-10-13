// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java. util.*;
public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7};
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      int randomIndex = random.nextInt(array.length);
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }

    // shuffled array
    System.out.println(Arrays.toString(array));

    //Roman Number as input and convert it to an integer
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Roman Number: ");
    String romanNumeral = scanner.next();

    int integer = romanToInteger(romanNumeral);

    //integer value of the Roman Number
    System.out.println("The integer value of the Roman Number is: " + integer);

    // Checking pangram or not
    System.out.println("Enter a sentence: ");
    String sentence = scanner.next();

    boolean isPangram = isPangram(sentence);

    // Printing pangram or not
    System.out.println("The sentence is pangram: " + isPangram);
  }

  private static int romanToInteger(String romanNumeral) {
    int integer = 0;
    int previousValue = 0;
    for (int i = 0; i < romanNumeral.length(); i++) {
      int currentValue = romanNumeral.charAt(i);
      switch (currentValue) {
        case 'I':
          integer += 1;
          break;
        case 'V':
          integer += 5;
          break;
        case 'X':
          integer += 10;
          break;
        case 'L':
          integer += 50;
          break;
        case 'C':
          integer += 100;
          break;
        case 'D':
          integer += 500;
          break;
        case 'M':
          integer += 1000;
          break;
      }

      if (currentValue > previousValue) {
        integer -= previousValue;
      }

      previousValue = currentValue;
    }

    return integer;
  }

  private static boolean isPangram(String sentence) {
    Set<Character> alphabet = new HashSet<>();
    for (char character : sentence.toLowerCase().toCharArray()) {
      if (character >= 'a' && character <= 'z') {
        alphabet.add(character);
      }
    }

    return alphabet.isEmpty();
}
}
