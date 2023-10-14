package com.misc;

public class Test {
    int n;
    int position;

    public Test(int n, int position) {
        this.n = n;
        this.position = position;
    }

    public void jumpLeft() {
    }

    public void jumpRight() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public int position() {
        return this.position;
    }

    public static void main(String[] args) {
        Test platformer = new Test(6, 3);
        System.out.println(platformer.position()); // should print 3

        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1

        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}
