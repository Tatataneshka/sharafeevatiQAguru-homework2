package org.example.javaBasisAddLess3;

public abstract class Operation {


    private final String name;
    private final char symbol; //символ знака операции + - *

    public Operation(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    //что делает наш калькулятор:
    public abstract int doOperation(int first, int second);
    }
