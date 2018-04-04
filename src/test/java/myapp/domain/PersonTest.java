package myapp.domain;

import static org.junit.Assert.*;
import myapp.domain.Person;

public class PersonTest {
    @org.junit.Test
    public void getGreeting() throws Exception {
        Person p = new Person("Jared", "Blitzstein");
        String greeting = p.getGreeting();
        assertEquals(greeting, "Hello Jared Blitzstein");

    }

}