package com.itAcademy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOfNumbers {
    private final Set<Integer> numbersSet;

    public StringOfNumbers() {
        numbersSet = new HashSet<>();
    }

    public StringOfNumbers inputNumbers(String inputNumbers) {
        Matcher matcher = Pattern.compile("[0-9]").matcher(inputNumbers);
        while (matcher.find()) {
            numbersSet.add(Integer.valueOf(inputNumbers.substring(matcher.start(), matcher.end())));
        }
        return this;
    }

    public void printNumbers() {
        for (Integer number : numbersSet) {
            System.out.print(number + ", ");
        }
    }
}
