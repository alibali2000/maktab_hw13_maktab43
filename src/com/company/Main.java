package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        String[] arry = new String[]{"amir","hatef","mehran","mojtaba","mohammad","ali","davood","reza","mohsen"};
        List<String> arranged = Arrays.asList(arry);
        System.out.println(arranged);
        System.out.println(arranged.stream().collect(Collectors.groupingBy((String s) -> s.length())));
    }
}
