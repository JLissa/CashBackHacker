package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void calculateIfLessThanBoundaryTest() {
        CashbackHackService service = new CashbackHackService();
        int actual = 200;
        int expected = service.remain(800);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAmount1000Test() {
        CashbackHackService service = new CashbackHackService();
        int actual = 0;
        int expected = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculateAmount0Test() {
        CashbackHackService service = new CashbackHackService();
        int actual = 1000;
        int expected = service.remain(0);

        Assert.assertEquals(actual, expected);
    }
}