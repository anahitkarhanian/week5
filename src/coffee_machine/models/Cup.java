package coffee_machine.models;

import java.util.Arrays;

public class Cup {
    private Drink drink;
    private Sugar[] sugar;
    private Stick stick;

    public void setDrink(Drink drink){
        this.drink = drink;
    }

    public void setSugar(Sugar[] sugar) {
        this.sugar = sugar;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "drink=" + drink +
                ", sugar=" + Arrays.toString(sugar) +
                ", stick=" + stick +
                '}';
    }
}
