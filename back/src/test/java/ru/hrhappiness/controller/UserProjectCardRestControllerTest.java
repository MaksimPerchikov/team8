package ru.hrhappiness.controller;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import ru.hrhappiness.Starter;
import ru.hrhappiness.dao.UserProjectCardDao;


@SpringBootTest(classes = Starter.class)
public class UserProjectCardRestControllerTest extends TestCase {

    private UserProjectCardDao userProjectCardDao;
    private UserProjectCardRestController userProjectCardRestController;

    public void testHi() {
        assertEquals("it's","ok",userProjectCardRestController.hi());
    }
}