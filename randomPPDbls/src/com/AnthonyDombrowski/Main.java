package com.AnthonyDombrowski;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      StringBuffer input = new StringBuffer();
      List<Player> names = new ArrayList<>();

      try (Scanner scanIn = new Scanner(System.in)) {
        while (true) {
          System.out.println("Enter a name (f when done adding names): ");
          input.append(scanIn.nextLine());

          String nameGiven = input.toString();

          if (nameGiven.equalsIgnoreCase("f")) {
            break;
          }

          names.add(new Player(nameGiven));
          input.delete(0, input.length());
        }
      } catch (Exception e) {
        System.err.println("Reading names failed with exception: " + e.toString());
      }

      System.out.println("Added names: \n" + names.toString());
    }
}
