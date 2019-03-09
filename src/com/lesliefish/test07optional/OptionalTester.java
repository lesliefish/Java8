package com.lesliefish.test07optional;

import java.util.Optional;

public class OptionalTester {

    public static void test() {
        OptionalTester optionalTester = new OptionalTester();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // 传入空值
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(optionalTester.sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        // 不存在返回另一个值5
        Integer value1 = a.orElse(new Integer(5));
        Integer value2 = b.get();
        return value1 + value2;
    }
}