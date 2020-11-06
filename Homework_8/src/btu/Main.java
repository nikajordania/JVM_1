package btu;

import Task_1.*;
import Task_2.*;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        ClassRandom obj_1 = new ClassRandom();
        obj_1.method_1();
        System.out.println("Sum of numbers which m[i] < i: " + obj_1.method_2());
        System.out.println("Multiple of numbers which m[i] > i: " + obj_1.method_3());
        obj_1.method_4();

        deleteFiles();
        FamilyBudget familyBudget = new FamilyBudget();
        familyBudget.setMoney(30000);
        familyBudget.familyStatus();
        System.out.println(familyBudget.getMoney());
        FamilyMember member1 = new FamilyMember("Nika", "Gogua", 18, "Brother");
        FamilyMember member2 = new FamilyMember("Nia", "Gogua", 18, "Sister");
        FamilyMember member3 = new FamilyMember("Gia", "Gogua", 45, "Father");
        member1.setBudget(familyBudget);
        member2.setBudget(familyBudget);
        member3.setBudget(familyBudget);
        member1.setAmount(300);
        member2.setAmount(200);
        member3.setAmount(500);
        member1.start();
        member2.start();
        member3.start();
    }

    private static void deleteFiles() {
        File file = new File("budget.txt");
        if (file.isFile()) {
            file.delete();
        }
        file = new File("family.txt");
        if (file.isFile()) {
            file.delete();
        }
    }
}
