package by.itstep.vlad.model.logic;

// age
// 3 head after birthday
// 1) 0 ... 100 --> +3 head every years
// 2) 101....200 --> +2 head
// 3) 201... --> +1 head
// 4) fool proof

import by.itstep.vlad.model.data.Dragon;

public class DragonLogic {

    public static final int FIRST_PERIOD = 100;
    public static final int SECOND_PERIOD = 200;

    public static int calculateHeads(Dragon dragon) {


        if (dragon.age < 1) {
            return -1; //// прерывает метод
        }

        int head = 3;

        if (dragon.age <= FIRST_PERIOD) {

            head += dragon.age * 3;

        } else if (dragon.age <= SECOND_PERIOD) {

            head += FIRST_PERIOD * 3 + (dragon.age - FIRST_PERIOD) * 2;

        } else {

            head +=  FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2 + dragon.age - SECOND_PERIOD;

        }


        return head;

    }

}
