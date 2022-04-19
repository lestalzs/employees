package microservices.training.employees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class HelloIT {
    @Autowired
    HelloController helloController;

    @Test
    void sayHello()
    {
        String message = helloController.sayHello();

        assertTrue(message.startsWith("Hello spring boot"));
    }

}
