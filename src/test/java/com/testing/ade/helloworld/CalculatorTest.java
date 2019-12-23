package com.testing.ade.helloworld;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertThat(result, is(equalTo(5)));
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertThat(result, is(equalTo(6)));
    }
}
