package guru.qa.tests.javaBasisAddLess3Tests;


import org.example.javaBasisAddLess3.Operation;
import org.example.javaBasisAddLess3.implementation.DivOperation;
import org.example.javaBasisAddLess3.implementation.MultOperation;
import org.example.javaBasisAddLess3.implementation.SubOperation;
import org.example.javaBasisAddLess3.implementation.SumOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTest {

    private Operation operation;

    @Test
    void doMultOperationTest() {
        operation = new MultOperation();
        Assertions.assertEquals(6, operation.doOperation(3, 2));
    }


    @Test
    void doSumOperationTest() {
        operation = new SumOperation();
        Assertions.assertEquals(5, operation.doOperation(3,2));
    }

    @Test
    void doSubOperationTest() {
        operation = new SubOperation();
        Assertions.assertEquals(1, operation.doOperation(3,2));
    }

    @Test
    void doDivOperationTest() {
        operation = new DivOperation();
        Assertions.assertEquals(3, operation.doOperation(6,2));
    }


}
