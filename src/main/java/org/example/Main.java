package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  private int age;
  private String seatClass;

  public static String calculateTheCost(int age, String seatClass) {
    if (age == 1) {
      if (seatClass.equals("Economy")) {
        return "100.000 VND/ticket";
      } else if (seatClass.equals("Business")) {
        return "300.000 VND/ticket";
      }
    } else if (age >= 2 && age <= 11) {
      if (seatClass.equals("Economy")) {
        return "1.500.000 VND/ticket";
      } else if (seatClass.equals("Business")) {
        return "3.500.000 VND/ticket";
      }
    } else if (age > 11) {
      if (seatClass.equals("Economy")) {
        return "1.700.000 VND/ticket";
      } else if (seatClass.equals("Business")) {
        return "4.000.000 VND/ticket";
      }
    }
    return "Invalid input!";
  }

  public static String provideEntertainmentServices(String seatClass) {
    if (seatClass.equals("Economy")) {
      return "Not providing entertainment services!";
    } else if (seatClass.equals("Business")) {
      return "Provide entertainment services!";
    } else {
      return "Invalid input!";
    }
  }

  public static String buyAirlineTicket(int age, String seatClass) {
    String cost = calculateTheCost(age, seatClass);
    String services = provideEntertainmentServices(seatClass);
    if (cost.equals("Invalid input!") || services.equals("Invalid input!")) {
      return "Invalid input!";
    } else {
      return cost + " & " + services;
    }
  }

  public static void main(String[] args) {
    int age;

    String seatClass;
    Scanner scanner = new Scanner(System.in);

    try {
      age = scanner.nextInt();
      seatClass = scanner.next();

      System.out.println(buyAirlineTicket(age, seatClass));
    } catch (InputMismatchException e) {
      System.out.println("Invalid input!");
    }
  }
}
