package com.xll.code_utils.simple;

public class Strings {

    /**
     * 获得重复str组成的字符串
     */
    public static String repeatStr(String repeat, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(repeat);
        }
        return builder.toString();
    }

}
