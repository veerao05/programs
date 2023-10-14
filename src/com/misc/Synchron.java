package com.misc;

import java.util.*;
import java.util.stream.Collectors;

interface A {
    default void method() {
        System.out.println("method in a");
    }
}

interface B {
    default void method() {
        System.out.println("method in b");
    }

}

class DefaultClass implements A, B {
        @Override
        public void method() {
            A.super.method();
        }

    }

abstract  class Abstraction{
        final void test(){

        }

}
    class Synchron {
        public static void main(String[] args) {

            String str = "{{}}()";
            char[] strArray = str.toCharArray();
            DefaultClass defaultClass = new DefaultClass();
            defaultClass.method();
            Stack<Character> stack = new Stack<>();
        /*for (int i = 0; i < strArray.length - 1; i++) {
            if(strArray[i]== "{" || strArray[i] == "(" || strArray[i] == "[") {
                stack.push();
            }
        }*/

            List<Integer> list = Arrays.asList(5, 8, 14, 4, 13, 9, 10, 9);
            int target = 18;
            List<List<Integer>> result = new ArrayList<>();

            // o/p [[13, 5], [10, 8], [4, 14], [9, 9]]

           Set<Integer> set = new HashSet<>();
            for (int i = 0; i < list.size() ; i++) {
                if (set.contains(target - list.get(i))) {
                    //map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
                    List<Integer> lst = new ArrayList<>();
                    lst.add(list.get(i));
                    lst.add(target - list.get(i));
                    result.add(lst);
                } else {
                    set.add(list.get(i));
                }
            }
            System.out.println(result);
            List<String> list1 = Arrays.asList("abc", "def", "xyz", "mno", "pqr", "def", "xyz", "stu");
            Set<String> set1=new LinkedHashSet<>();
            list1.stream().filter(s->set1.add(s)).forEach(System.out::println);

        }


    }



//
