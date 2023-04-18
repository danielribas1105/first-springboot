package drcode.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculator calculator;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calculator.addNum(2,7));
    }
}
