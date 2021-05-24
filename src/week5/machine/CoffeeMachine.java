/*
package week5.machine;

public abstract class CoffeeMachine {
    private int sugarCount;
    private int balance;
    private final int coffeeAmount;
    private final int teaAmount;

    CoffeeMachine(){
        coffeeAmount = 300;
        teaAmount = 250;
        balance = 0;
        sugarCount = 3;
    }

    void setBalance(int amount){
        balance = amount;
    }

    int getBalance(){
        return balance;
    }

    void setSugarCount(int sugarCount){
        this.sugarCount = sugarCount;
    }

    int getSugarCount(){
        return sugarCount;
    }

    int getCoffeeAmount(){
        return coffeeAmount;
    }

    int getTeaAmount(){
        return teaAmount;
    }

    boolean checkBalance(int amount){
        return amount <= balance;
    }

    void returnBalance(int amount){
        if (checkBalance(amount)) {
            int trifle = this.balance - coffeeAmount;
            System.out.println("take your trifle" + trifle);
        } else {
            int trifle = coffeeAmount - this.balance;
            System.out.println("please add" + trifle);
        }
    }


    void getDrink(String str) {
        switch (str) {
            case "C":
                if (checkBalance(coffeeAmount)) {
                    returnBalance(coffeeAmount);
                    getCup();
                    getCoffe();
                }
            case "T":
                if (checkBalance(teaAmount)) {
                    getCup();
                    getCoffe();
                }
        }
        return false;
    }

}
*/
