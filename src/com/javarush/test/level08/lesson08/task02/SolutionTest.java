package com.javarush.test.level08.lesson08.task02;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCreateSet() throws Exception {
    assert equals(Solution.createSet().size(),20);
    }

    private boolean equals(int size, int i) {
        return size == i ? true : false;
    }

    /*@Test
    public void testRemoveAllNumbersMoreThan10() throws Exception {
        as

    }*/
}