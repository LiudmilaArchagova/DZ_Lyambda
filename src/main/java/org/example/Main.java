package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 1 Создайте список чисел. С помощью метода forEach выведите каждое число в консоль по
        //модулю.
        System.out.println("Task 1");
        List<Integer> list = List.of(1, 3, -5, 6, 7, 78, -21);
        list.forEach(n -> System.out.println(Math.abs(n)));
        System.out.println();


        //2 Создайте класс Item с полями названия товара и стоимости товара. Создайте мапу,
        //хранящую товар и соответствующее ему число единиц товара. С помощью метода forEach
        //получите все товары, у которых осталось меньше 3 штук.
        System.out.println("Task 2");
        Map<Item, Integer> nameToAmount = new HashMap<>();
        Item speaker = new Item("Speaker", 40);
        Item TV = new Item("TV", 200);
        Item monitor = new Item("Monitor", 50);
        Item printer = new Item("Printer", 123);
        nameToAmount.put(speaker, 2);
        nameToAmount.put(printer, 1);
        nameToAmount.put(TV, 5);
        nameToAmount.put(monitor, 13);
        nameToAmount.forEach((item, integer) -> {
            if (integer < 3) System.out.println(item);
        });
        System.out.println();

        //3 Создайте функциональный интерфейс для генерации случайных чисел в заданном
        //диапазоне. Используйте лямбда-выражение для генерации числа.
        System.out.println("Task 3");
        interface Randomise<T> {
            T getRandom(T x, T y);
        }
            Randomise<Integer> randomise1 = (Integer x, Integer y) -> {
                Random random = new Random();
                return random.nextInt(x, y);
            };
        System.out.println(randomise1.getRandom(100, 200));
        System.out.println();


        //4 Создайте предикат для удаления из списка тех строк, что начинаются с определённой
            //буквы. Создайте список строк и удалите элементы с помощью метода removeIf, передав в
            //него предикат.;
        System.out.println("Task 4");
            Predicate<String> startsWithS = s -> s.startsWith("S");
            List<String> lines = new java.util.ArrayList<>(List.of("Same old, Same old", "Deal with it", "Wise people", "Sula was scary"));
       lines.removeIf(startsWithS);
        System.out.println(lines);


        }

    }