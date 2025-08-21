package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Operation;

public class SumOperation extends Operation {
    public SumOperation() {
        super("сложение", '+');
    }

    @Override
    public int doOperation(int first, int second) {
        return first + second;
    }
}
