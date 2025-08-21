package org.example.javaBasisAddLess3.mock;

import org.example.javaBasisAddLess3.EnumOperations;
import org.example.javaBasisAddLess3.Operation;
import org.example.javaBasisAddLess3.Reader;

public class MockReader implements Reader {

    @Override
    public int readFirst() {
        return 15;
    }

    @Override
    public int readSecond() {
        return 10;
    }

    @Override
    public Operation readOperation() {
        return EnumOperations.SUM.getImplementation();
    }
}
