package com.misc;

import java.util.ArrayList;
import java.util.List;

public class Platformer {
    private List<Boolean> tiles;
    private int position;

    public Platformer(int N, int X) {
        tiles = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            tiles.add(true);
        }
        position = X;
    }

    public void jumpLeft() {
        tiles.set(position, false);
        position--;
    }

    public void jumpRight() {
        tiles.set(position, false);
        position++;
    }

    public int position() {
        return position;
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position()); // should print 3

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1

        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}
