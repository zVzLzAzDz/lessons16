package by.itstep.vlad.controller;

import by.itstep.vlad.model.data.Dragon;
import by.itstep.vlad.model.logic.DragonLogic;
import by.itstep.vlad.utill.UserInput;
import by.itstep.vlad.view.Printer;

public class Task02 {
    public static void main(String[] args) {

        Dragon dragon = new Dragon();

        dragon.name = UserInput.inputString("Input dragon name: ");
        dragon.age = UserInput.inputNumber("Input dragon age: ");


        int head = DragonLogic.calculateHeads(dragon);
        String msg = String.format("%s has %d heads\n",dragon.name, head);
        Printer.print(msg);

    }
}
