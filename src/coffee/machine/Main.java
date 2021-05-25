package coffee.machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandCoffeeMachine = scanner.next();
        Command command = new Command(commandCoffeeMachine);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine.makeProduct(command).toString());
    }
}
