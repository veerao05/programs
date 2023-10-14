package com.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SmallestQueueImpl implements SmallestQueue {

    private List<Queue<String>> list = new ArrayList<>();

    public SmallestQueueImpl(int counters) {

        for (int i = 0; i <= counters; i++) {
            Queue<String> q = new LinkedList<>();
            this.list.add(q);
        }
    }

    @Override
    public void addPerson(String x) {
        int value = smallestQ();
        list.get(value).add(x);
    }

    @Override
    public Integer getSmallestCounter() {
        return smallestQ();
    }


    private int smallestQ() {
        Queue<String> q = list.get(0);
        int val=0;
        int smallestQueue = list.get(0).size();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).size() < smallestQueue) {
                q = list.get(i);
                smallestQueue = q.size();
                val=i;

            }
        }
        return val;
    }

}
