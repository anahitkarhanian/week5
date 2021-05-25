package coffeeMachine.util;

import coffeeMachine.model.DrinkType;

public class Command {
    private DrinkType drinkType;
    private int sugar;

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType(){
        return drinkType;
    }

    public void setSugar(String input){
        sugar = Integer.valueOf(input);
    }

    public int getSugar() {
        return sugar;
    }

    public boolean isStick(){
        return sugar > 0;
    }
}
