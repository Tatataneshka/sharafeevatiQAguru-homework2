package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Operation;

public class MultOperation extends Operation {
    public MultOperation() {
        super("умножение", '*');
    }

    @Override
    public int doOperation(int first, int second) {
        return first * second;
    }
}
