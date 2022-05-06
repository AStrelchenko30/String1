package ru.skypro;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 5");
        String fullName = "Ivanov Ivan Ivanovich";
        int index = fullName.indexOf(" ");
        int index2 = fullName.lastIndexOf(" ");
        String name = fullName.substring(index + 1, index2);
        String lastName = fullName.substring(0, index);
        String secondName = fullName.substring(index2 + 1, fullName.length());
        System.out.println("Имя сотрудника-" + name);
        System.out.println("Фамилия сотрудника-" + lastName);
        System.out.println("Отчество сотрудника-" + secondName);
        System.out.println("Задание 6");
        String wrongname = "ivanov ivan ivanovich";
        StringBuilder stringBuilder = new StringBuilder();
        for (String needName : wrongname.split(" ")){
            stringBuilder.append(Character.toUpperCase(needName.charAt(0)) + needName.substring(1)).append(' ');
        }
        System.out.println(stringBuilder.toString());
        System.out.println("Задание 7");
        StringBuilder one = new StringBuilder("135");
        one.insert(1, 2);
        one.insert(3, 4);
        one.insert(5, 6);
        System.out.println(one.toString());
        System.out.println("Задание 8");
        String text = "aabccddefgghiijjkk";
        text = text.replaceAll("([a-z])\\1+", "$1");
        System.out.println(text);

    }
    }










