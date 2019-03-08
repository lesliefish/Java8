package com.lesliefish.test02lambdaexpressions;

public class LambdaTester02 {
    final static String salutation = "Hello~";

    public static void test() {
        GreetingService greetingService = message ->
        {
            System.out.println( salutation + message + "!!!~~");
        };
        greetingService.sayMessage("lesliefish");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}

