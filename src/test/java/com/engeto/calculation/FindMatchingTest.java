package com.engeto.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMatchingTest {
    static List<Double> testList;

    @BeforeAll
    static void setup() {
        testList = List.of(10.0, 15.45, 5.811, 175.0);
    }

    @Test
    void findMatching() {
        Double testResult = FindMatching.findMatching(testList, 4.0, 9.3);
        Assertions.assertEquals(5.811, testResult);
    }

    @Test
    void findMatchingExac() {
        Double testResult = FindMatching.findMatching(testList, 4.0, 10.0);
        Double expected = 10.0;

        Assertions.assertEquals(expected, testResult);

    }

    @Test
    void findMatchingNull() {
        Double testResult = FindMatching.findMatching(testList, 1.0, 1.0);
        Double expected = null;

        Assertions.assertEquals(expected, testResult);
    }


}