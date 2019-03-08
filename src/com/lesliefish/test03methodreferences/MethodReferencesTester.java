package com.lesliefish.test03methodreferences;

import java.util.ArrayList;
import java.util.List;

// 方法引用
public class MethodReferencesTester {
    public static void test() {
        List names = new ArrayList();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
