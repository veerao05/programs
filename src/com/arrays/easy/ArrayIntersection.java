package com.arrays.easy;

import java.util.*;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer,Integer> map = new HashMap<>();

      for(int i=0;i<=nums1.length-1;i++){
          //map.put(ch, map.getOrDefault(ch, 0) + 1);
           map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
      }
      List<Integer> res=new ArrayList<>();
      for(int element : nums2){
          if( map.get(element)!=null && map.get(element) >0 ){
              res.add(element);
              map.put(element,map.get(element)-1);
          }
      }
      return res.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] arr1= new int[]{1,2,2,1};
        int[] arr2= new int[]{1,1};
        System.out.println(Arrays.toString(intersect(arr1,arr2)));


    }
}
