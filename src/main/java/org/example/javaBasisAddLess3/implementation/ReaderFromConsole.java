package org.example.javaBasisAddLess3.implementation;

import org.example.javaBasisAddLess3.Operation;
import org.example.javaBasisAddLess3.EnumOperations;
import org.example.javaBasisAddLess3.Reader;

import java.util.Scanner;

public class ReaderFromConsole implements Reader {

    private Scanner sc = new Scanner(System. in);

    @Override
    public int readFirst() {
        return sc.nextInt();
    }

    @Override
    public int readSecond() {
        return sc.nextInt();
    }

    @Override
    public Operation readOperation() {
      //   char symbol = sc.next().charAt(0);
       // EnumOperations.MULT.getImplementation();
        return EnumOperations.lookup(sc.next().charAt(0)).getImplementation();
    }
}
