package week5.coffee_machine;

public class Command {
    private DrinkType drinkType;
    private int sugar;

    Command(String str){
        setDrinkType(str);
        setSugar(str);
    }

    private void setDrinkType(String str){
        switch (str.charAt(0)){
            case 'C': drinkType = DrinkType.COFFEE;
            break;
            case 'T': drinkType = DrinkType.TEA;
            break;
            case 'S': drinkType = DrinkType.CHOCOLATE;
            break;
        }
    }

    public DrinkType getDrinkType(){
        return drinkType;
    }

    private void setSugar(String str){
        sugar = Integer.valueOf(str.charAt(2));
    }

    public int getSugar() {
        return sugar;
    }

    boolean getStick(){
        return sugar > 0;
    }
}
