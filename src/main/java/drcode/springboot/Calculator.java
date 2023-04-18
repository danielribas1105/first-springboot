package drcode.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int addNum(int num1, int num2){
        return num1 + num2;
    }
}
