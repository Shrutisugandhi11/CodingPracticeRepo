package org.example;

import org.example.design_pattern.factory.Fruit;
import org.example.design_pattern.factory.FruitFactory;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your fruit:");
        String fruitName = scanner.nextLine();
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = fruitFactory.getInstance(fruitName);
        System.out.println("Your fruits color is:" + fruit.fruitColor());
    }
}
