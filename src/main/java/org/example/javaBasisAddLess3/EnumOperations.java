package org.example.javaBasisAddLess3;

import org.example.javaBasisAddLess3.implementation.DivOperation;
import org.example.javaBasisAddLess3.implementation.SubOperation;
import org.example.javaBasisAddLess3.implementation.MultOperation;
import org.example.javaBasisAddLess3.implementation.SumOperation;

public enum EnumOperations {

    SUM(new SumOperation()),
    MULT(new MultOperation()),
    SUB(new SubOperation()),
    DIV (new DivOperation());


    private final Operation operation;

    EnumOperations(Operation operation) {
        this.operation = operation;
    }

    public Operation getImplementation() {
        return operation;
    }

    // метод , который ищет подходящую операцию (сумма/умножить/разделить) по символу,
    //который будет ввеён в консоли нашего калькулятора
    // !! static должен быть этот метод, чтоб вызывать от имени Класса
    public static EnumOperations lookup(char symbolFromConsoleNaVhod) {
        for (EnumOperations value : values())
        {
            if (value.getImplementation().getSymbol() == symbolFromConsoleNaVhod)
                return value;
        }
        try {
            throw new IllegalAccessException("Некорректный символ: " + symbolFromConsoleNaVhod);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}