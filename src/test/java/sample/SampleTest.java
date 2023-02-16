package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    public void printHelloWorld() {
        Sample sample = new Sample();
        String message = sample.helloWorld();

        Assertions.assertEquals(message, "Hello World");
    }
}
