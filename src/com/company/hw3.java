package com.company;

import java.util.ArrayList;

public class hw3 {

    public static void main(String[] args) {
        ArrayList<String> a = split (args);
        for (String b : a)
            System.out.print (b + " ");
    }

    public static ArrayList<String> split (String[] arr) {
        String arg1 = arr[0];
        int i = arg1.indexOf (arr[1]);
        int j = 0;
        ArrayList<String> result = new ArrayList<String>();
        if (i == -1) {
            result.add (arg1);
            return result;
        }

        if (i != 0) {
            result.add (arg1.substring (0, i));
        }

        while (j != -1) {
            arg1 = arg1.substring (i + arr[1].length(), arg1.length());
            j = arg1.indexOf (arr[1]);
            if (j == -1) {
                result.add (arg1);
            }
            else {
                if (!arg1.substring (0, j).equals ("")) {
                    result.add (arg1.substring(0, j));
                }
                i = j;
            }
        }
        return result;
    }
}
