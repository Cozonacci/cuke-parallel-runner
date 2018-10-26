package org.madsol.tas;

public class Bucket {

    private int fruits;

    public Bucket() {
        this.fruits = 0;
    }

    public Bucket(int fruits) {
        this.fruits = fruits;
    }

    public int getFruits() {
        return fruits;
    }

    public void setFruits(int fruits) {
        this.fruits = fruits;
    }

    public void addFruits(int receivedFruits) {
        this.fruits += receivedFruits;
    }
}
