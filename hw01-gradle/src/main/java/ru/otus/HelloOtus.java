package ru.otus;
import static com.google.common.base.Strings.isNullOrEmpty;

public class HelloOtus {
    public static String checkString(String str) {
        if(isNullOrEmpty(str)) {
            return "String is empty";
        }
        return "String is not empty";
    }

    public static void main(String[] args) {
            checkString("");
    }
}