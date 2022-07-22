package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiseTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 2;
        int actual = service.calculate(200,280);

        Assertions.assertEquals(expected, actual);
    }

    }
