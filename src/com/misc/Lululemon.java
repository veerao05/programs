package com.misc;

/* Question :
Person class - id and name.
create objects and add to the list. convert list to map using java streams api.
 */

/*
Find a pair with the given sum in an array
Input:

nums = [8, 7, 2, 5, 3, 1]
target = 10

Output:

Pair found (8, 2)
or
Pair found (7, 3)

 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Lululemon {
    public static void main(String[] args) {
      /*  List<Person> list = new ArrayList<>();
        list.add(new Person(1,"vna"));
        list.add(new Person(2,"vid"));
        //key id  value name
        Map<Integer,Person> map = list.stream().collect(Collectors.toMap(Person::getId,Function.identity()));
        System.out.println(map.toString());*/

        int[] nums = new int[] {8, 7, 2, 5, 3, 1};
        int target = 10;
       findPairs(nums,target);

    }

    static void findPairs(int[] nums, int sum) {


        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+ nums[j]==sum){
                    System.out.println(nums[i] +" " + nums[j]);
                }
            }

        }

    }
}
