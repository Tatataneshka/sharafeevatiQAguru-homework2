package org.example;

import org.example.javaBasisAddLess3.Calculator;
import org.example.javaBasisAddLess3.implementation.ReaderFromConsole;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String result = new Calculator(new ReaderFromConsole()).run();
        System.out.println("Result = " + result);
        }
    }
