package com.engeto.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Daniel", "San", 39);
    }

    @Test
    void getName() {
        String actual = person.getName();
        String excepted = "Daniel";
        Assertions.assertEquals(actual, excepted);
    }

    @Test
    void setName() {
        person.setName("Stephan");
        String actual = person.getName();
        String excepted = "Stephan";
        Assertions.assertEquals(actual, excepted);

    }

    @Test
    void getSurename() {
        String actual = person.getSurename();
        String excepted = "San";
        Assertions.assertEquals(actual, excepted);
    }

    @Test
    void setSurename() {
//        String actual = person.getSurename();
//        String excepted = "San";
//        Assertions.assertEquals(actual, excepted);

        Person person1 = new Person();
        person1.setSurename("Tester");
        //     Assertions.assertNull(person1.getSurename());
        Assumptions.assumeTrue(person1.getSurename() == null); // ak vyhodi zle tak preskoci test
        person1.setSurename("Tester");
        String actual = person1.getSurename();
        Assertions.assertEquals(actual, "Tester");

    }

    @Test
    void getAge() {
        int actual = person.getAge();
        int expected = 39;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void setAge() {
        person.setAge(35);
        int expected = 35;
        int actual = person.getAge();
        Assertions.assertEquals(actual, expected);
    }
}