package model;

import java.io.IOException;

public class Caculator {
    public static float caculator(float firstNumber, float secondNumber, char operator ){
        switch (operator){
            case '+' :
                return firstNumber+secondNumber;
            case '-' :
                return firstNumber-secondNumber;
            case '*' :
                return firstNumber*secondNumber;
            case '/':
                if (secondNumber==0){
                   throw new RuntimeException("can't division by zero");
                }else
                    return firstNumber/secondNumber;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
