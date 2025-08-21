package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Operation;

public class DivOperation extends Operation {
    public DivOperation() {
        super("деление", '/');
    }


    @Override
    public int doOperation(int first, int second) {
        return first / second;
    }
}
