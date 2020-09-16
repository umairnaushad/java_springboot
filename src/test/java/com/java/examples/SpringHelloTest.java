package com.java.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpringHelloTest {

    @Test
    public void Test1() {
        SpringHello obj = new SpringHello();
        assertEquals("Hello Umair Naushad!", obj.home());
    }

}
