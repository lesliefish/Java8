package com.lesliefish.test02lambdaexpressions;

public class LambdaTester01 {

    public static void test() {
        LambdaTester01 tester = new LambdaTester01();

        // 带类型声明的lambda
        MathOperation addition = (int a, int b) -> a + b;

        // 不带类型声明的lambda
        MathOperation subtraction = (a, b) -> a - b;

        // 带return语句的lambda
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));

        // 不带括号的lambda
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 带括号的lambda
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("leslie");
        greetService2.sayMessage("fish");
    }

    // 数学操作
    interface MathOperation {
        int operation(int a, int b);
    }

    // 字符串操作
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
