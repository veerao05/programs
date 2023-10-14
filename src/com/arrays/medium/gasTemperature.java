package com.arrays.medium;

public class gasTemperature {
    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal=0;
        int costTotal=0;
        int current = 0, start=0;
        for (int j : gas) {
            gasTotal += j;
        }
        for (int j : cost) {
            costTotal += j;
        }
        if(gasTotal < costTotal) return -1;

        for(int i=0;i<gas.length;i++){
             current += gas[i] - cost[i];
            if(current<0){
                start = i+1;
                current=0;
            }
        }

        return start;
    }
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
}
