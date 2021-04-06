package com.w07.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProovTest {

    @Test
    public void main() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}