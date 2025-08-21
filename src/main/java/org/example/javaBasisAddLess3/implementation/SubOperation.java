package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Operation;

public class SubOperation extends Operation {
    public SubOperation() {
        super("вычитание", '-');
    }


    @Override
    public int doOperation(int first, int second) {
        return first - second;
    }
}
