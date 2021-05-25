package coffeeMachine;

import coffeeMachine.util.CommandConvertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine.makeProduct(CommandConvertor.convertInput(input)).toString());

    }
}
