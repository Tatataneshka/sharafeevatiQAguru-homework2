package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Calculator;
import org.example.javaBasisAddLess3.mock.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator testedObject = new Calculator(new MockReader());

    @Test
    void run() {
        String run = testedObject.run();

        Assertions.assertEquals("Результат:  25", run);
    }
}