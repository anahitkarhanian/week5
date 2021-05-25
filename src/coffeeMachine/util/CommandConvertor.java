package coffeeMachine.util;


import coffeeMachine.model.DrinkType;

public class CommandConvertor {

    public static Command convertInput(String input){
        Command command = new Command();
        String[] array = input.split(":");
        switch (array[0]){
            case "T": command.setDrinkType(DrinkType.TEA);
                    break;
            case "S": command.setDrinkType(DrinkType.CHOCOLATE);
                break;
            case "C": command.setDrinkType(DrinkType.COFFEE);
                break;
        }

        command.setSugar(array[1]);
        return command;
    }

}
