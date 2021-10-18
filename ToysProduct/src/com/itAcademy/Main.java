package com.itAcademy;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Кукла", new Product("'Кукла'", 25));
        productMap.put("Робот", new Product("'Робот'", 20));
        productMap.put("Трактор", new Product("'Трактор'", 10));
        productMap.put("Машинка", new Product("'Машинка'", 15));

        System.out.println("entrySet():");
        Iteration.entrySet(productMap);
        System.out.println("keySet():");
        Iteration.keySet(productMap);
        System.out.println("values():");
        Iteration.values(productMap);
    }
}

