package com.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HPest {

    //Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
    //For example, given the input list A = [-2, 1, -3, 4, -1, 2, 1, -5, 4],
    // the function should return the subarray [4, -1, 2, 1] with the largest sum 6.
    public static void main(String[] args) {

       String text="Hello this is Java";
       String[] wordSplit = text.split(" ");
       char[] arr = text.toCharArray();
        String rev = "";
        for(int i=0;i<wordSplit.length;i++){
            rev = wordSplit[i]+" "+rev;
        }
        System.out.println(rev);

        List<String> names=new ArrayList<String>(Arrays.asList(new String[]{"vna","vid","viv"}));
        List<String> schoolNames=new ArrayList<String>(Arrays.asList(new String[]{"bethesda","kengeri","vidya"}));
        List<List<String>> schools=new ArrayList<>();
        schools.add(names);
        schools.add(schoolNames);

        System.out.println(schools);
        int a=10;
        System.out.println(schools.stream().flatMap(l->l.stream().map(String::toUpperCase)).collect(Collectors.toList()));
        }
    }


