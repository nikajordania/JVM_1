package Task_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {
    private int money;
    BufferedWriter bufferedWriter;

    public FamilyBudget() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    synchronized public void changeMoney(int amount) {
        if (amount <= getMoney()) {
            money -= amount;
        }
        moneyState();
    }

    public void familyStatus() {
        if (money >= 40000) {
            System.out.println("Rich Family");
        } else if (money >= 10000) {
            System.out.println("Medium Family");
        } else {
            System.out.println("Poor Family");
        }
    }

    private void moneyState() {
        File file = new File("budget.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(money + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}