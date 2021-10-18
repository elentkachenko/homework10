package com.itAcademy;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите числа через запятую:");
        String inputLine = new Scanner(System.in).nextLine();
        new StringOfNumbers().inputNumbers(inputLine).printNumbers();
    }
}
