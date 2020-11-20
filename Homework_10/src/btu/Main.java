package btu;

import Collections.*;

public class Main {

    public static void main(String[] args) {
        Task1 obj_1 = new Task1();
        obj_1.AddElements();
        System.out.println("Task1: " + obj_1.PrintItems());
        Task2 obj_2 = new Task2();
        obj_2.AddElements();
        System.out.println("Task2: " + obj_2.PrintItems());
        System.out.println("Task2: " + obj_2.ret());
        Task3 obj_3 = new Task3();
        obj_3.AddElements();
        System.out.println("Task3: " + obj_3.PrintItems() + "\nSorted: " + obj_3.sort());
        Task4 obj_4 = new Task4();
        obj_4.AddElements();
        System.out.println("Task4: " + obj_4.PrintItems() + "\nSort and Reverse: " + obj_4.SortRevers());
        Task5 obj_5 = new Task5();
        obj_5.AddElements();
        System.out.println("Task5: " + obj_5.PrintItems() + "\nAdd 3 numbers: " + obj_5.AddNumbs());
        Task6 obj_6 = new Task6();
        obj_6.AddElements();
        System.out.println("Task6: " + obj_6.PrintItems() + "\nAdd next numbers: " + obj_6.AddNextNumbs());
        Task7 obj_7 = new Task7();
        obj_7.AddElements();
        System.out.println("Task7: " + obj_7.PrintItems() + "\nAdd Enter numbers: " + obj_7.AddNextInput());
        Task8 obj_8 = new Task8();
        obj_8.AddElements();
        System.out.println("Task8: " + obj_8.PrintItems() + "\nRemove 3 numbers: " + obj_8.RemoveFirst3Numbs());
        Task9 obj_9 = new Task9();
        obj_9.AddElements();
        System.out.println("Task9: " + obj_9.PrintItems() + "\nRemove index numbers: " + obj_9.RemoveIndexNumbs());
        Task10 obj_10 = new Task10();
        obj_10.AddElements();
        System.out.println("Task10: " + obj_10.PrintItems() + "\nRemove even numbers: " + obj_10.even());
        Task11 obj_11 = new Task11();
        obj_11.AddElements();
        System.out.println("Task11: " + obj_11.PrintItems() + "\nRemove more than 30 numbers: " + obj_11.more30());
        Task12 obj_12 = new Task12();
        obj_12.AddElements();
        System.out.println("Task12: 7 to 15: " + obj_12.PrintItems());
        Task13 obj_13 = new Task13();
        obj_13.AddElements();
        System.out.println("Task13: Generate 20 words: " + obj_13.PrintItems());
        System.out.println("words which have char x: " + obj_13.x());
        Task14 obj_14 = new Task14();
        obj_14.ConvertToBinary();
        Task15 obj_15 = new Task15();
        obj_15.ConvertToDecimal();

    }
}
