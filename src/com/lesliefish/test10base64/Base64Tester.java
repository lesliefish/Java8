package com.lesliefish.test10base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Base64Tester {

    public static void test() {
        try {
            // basic编码
            String base64encodedString = Base64.getEncoder().encodeToString("lesliefish?java8".getBytes("utf-8"));
            System.out.println("Base64 编码后字符串 (Basic) :" + base64encodedString);
            // 解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));

            // url编码
            base64encodedString = Base64.getUrlEncoder().encodeToString(
                    "lesliefish?java8".getBytes("utf-8"));
            System.out.println("Base64 编码后字符串 (URL) :" + base64encodedString);

            // 10个uuid组成的字符串编码(MIME)
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码后字符串 (MIME) :\n" + mimeEncodedString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
