package coffee.machine;

public class CoffeeMachine {
    public Cup makeProduct(Command command){
        Cup cup = new Cup();
        addInCupDrink(command, cup);
        addInCupSugar(command, cup);
        addInCupStick(command, cup);
        return cup;
    }

    public void addInCupDrink(Command command, Cup cup){
        if(command.getDrinkType() == DrinkType.COFFEE){
            Coffee coffee = new Coffee();
            cup.setDrink(coffee);
        }

        if(command.getDrinkType() == DrinkType.CHOCOLATE){
            Chocolate chocolate = new Chocolate();
            cup.setDrink(chocolate);
        }

        if(command.getDrinkType() == DrinkType.TEA){
            Tea tea = new Tea();
            cup.setDrink(tea);
        }
    }

    public void addInCupSugar(Command command, Cup cup){
        if (command.getSugar() != 0) {
            Sugar[] sugars = new Sugar[command.getSugar()];
            for (int i = 0; i < sugars.length; i++) {
                sugars[i] = new Sugar();
            }
            cup.setSugar(sugars);
        }
    }

    public void addInCupStick(Command command, Cup cup){
        if (command.isStick()){
            Stick stick = new Stick();
            cup.setStick(stick);
        }
    }
}
