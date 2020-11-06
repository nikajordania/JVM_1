package Task_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FamilyMember extends Thread {
    private String name;
    private String lastName;
    private int age;
    private String status;
    private FamilyBudget budget;
    private int amount;
    private BufferedWriter bufferedWriter;

    public FamilyMember() {
    }

    public FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        addMemberAddToFile();
    }

    public void setBudget(FamilyBudget budget) {
        this.budget = budget;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void run() {
        takeMoney();
    }

    private void takeMoney() {
        Random random = new Random();
        for (int i = 1; i < random.nextInt(15) + 10; i++) {
            budget.changeMoney(this.amount);
            System.out.println(name + " " + this.getName() + " " + budget.getMoney());
        }
    }

    private void addMemberAddToFile() {
        File file = new File("family.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String member = name + " " + lastName + " " + age + " " + status;
            bufferedWriter.write(member + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
