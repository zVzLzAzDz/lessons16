package by.itstep.vlad.model.logic;

import by.itstep.vlad.model.data.Dragon;
import org.junit.Assert;
import org.junit.Test;

public class DragonLogicTest {


    @Test
    public void testFirstPeriodPositive() {

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstPeriodNegative() {

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstBoundPositive() {

        //arrange
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD;
        int expected = 303;

        // act

        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondPeriodPositive() {
        //arrange
        Dragon dragon = new Dragon();
        dragon.age = 130;
        int expected = 363;

        //act
        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSecondPeriodNegative() {
//        arrange
        Dragon dragon = new Dragon();
        dragon.age = -110;
        int expected = -1;

//        act

        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSecondBoundPositive() {
        // arrange
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.SECOND_PERIOD;
        int expected = 503;
        //act
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFinalPeriodPositive() {

        //arrange(организовывать)
        Dragon dragon = new Dragon();
        dragon.age = 205;
        int expected = 508;

        // act
        int actual = DragonLogic.calculateHeads(dragon);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testFinalPeriodNegative() {
        //arrange
        Dragon dragon = new Dragon();
        dragon.age = -219;
        int expected = -1;
        // act
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFinalBoundPositive() {
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD + DragonLogic.SECOND_PERIOD;
        int expected = 603;
        //act
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);
    }
}
