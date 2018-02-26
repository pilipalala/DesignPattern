package com.example.admin.myapplication.main;

import java.util.List;

/**
 * @author wangyujie
 *         on 2018/1/17.16:58
 *         TODO
 */

public class StaticFans {
    public static <T> void StaticMethod(T a) {

    }

    //定义
    public static <T> T[] fun1(T... arg) {  // 接收可变参数
        return arg;            // 返回泛型数组
    }

    public static <T extends Comparable> T min(T... a) {
        T smallest = a[0];
        for (T item : a) {
            if (smallest.compareTo(item)) {
                smallest = item;
            }

        }
        return smallest;
    }

    public <T> void OtherMethod(T a) {
        Integer[] integers = fun1(1, 2, 1, 1, 1);

    }

    public <T> List<T> parseArray(String response, Class<T> object) {
        return null;
    }

    public interface Comparable<T> {
        public boolean compareTo(T i);
    }

    public class StringCompare implements Comparable<StringCompare> {
        private String mStr;

        public StringCompare(String string) {
            this.mStr = string;
        }

        @Override
        public boolean compareTo(StringCompare str) {
            if (mStr.toString().length() > str.mStr.length()) {
                return true;
            }
            return false;
        }
    }


}
