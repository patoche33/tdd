package org.example;

import org.example.service.MathService;

public class CalculatorWithMathService {
    private MathService mathService;

    public  CalculatorWithMathService(MathService mathService){
        this. mathService = mathService;
    }

    public int add(int a, int b) {
        return mathService.add( a,  b);
    }

    public int subtract(int a, int b) {
        return mathService.subtract( a,  b);
    }

    public int multiply(int a, int b) {
        return mathService.divide( a,  b);
    }

    public int divide(int a, int b) {
        return mathService.divide( a,  b);
    }
}
