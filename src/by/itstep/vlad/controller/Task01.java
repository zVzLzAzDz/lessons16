package by.itstep.vlad.controller;

import by.itstep.vlad.model.data.Dragon;
import by.itstep.vlad.model.logic.DragonLogic;
import by.itstep.vlad.view.Printer;

public class Task01 {

    public static void main(String[] args) {
        Dragon garinch = new Dragon();
        garinch.age = 120;
        garinch.name = "Garinchi";

        Dragon pushok = new Dragon();
        pushok.age = 350;
        pushok.name = "Pushok";


        int head = DragonLogic.calculateHeads(garinch);
        String msg = String.format("Garinchi has %d heads\n", head);
        Printer.print(msg);

        head = DragonLogic.calculateHeads(pushok);
        msg = String.format("Pushok has %d heads\n", head);
        Printer.print(msg);

    }

}
