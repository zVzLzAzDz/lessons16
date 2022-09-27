package by.itstep.vlad.model.logic;

import by.itstep.vlad.model.data.Dragon;
import org.junit.Assert;
import org.junit.Test;

public class DragonLogicTest {


    @Test
    public void testFirstPeriodPositive(){

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstPeriodNegative(){

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstBoundPositive(){

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD;
        int expected = 303;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }
}
