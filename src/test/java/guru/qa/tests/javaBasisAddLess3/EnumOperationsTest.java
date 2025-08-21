package guru.qa.tests.javaBasisAddLess3;

import org.example.javaBasisAddLess3.EnumOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EnumOperationsLookupTest {

    //парметризованный тест
    //на вход нам нужны символы + - * /
    // на вход можем подать через аннотацию CsvSource массив символов

    @CsvSource({
            "+, сложение",
            "-, вычитание",
            "*, умножение",
            "/, деление"
    })

    @ParameterizedTest
    //@Test
    //тест проверить сам метод LookUp, что символ ожидаемый == текстовому имени символа из Энама
    void lookupTest(char symbol, String expected) {
        EnumOperations result = EnumOperations.lookup(symbol);
        Assertions.assertEquals(expected, result.getImplementation().getName());
    }
}