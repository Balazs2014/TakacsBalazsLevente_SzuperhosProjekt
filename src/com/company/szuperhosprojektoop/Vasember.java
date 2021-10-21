package com.company.szuperhosprojektoop;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Random rnd = new Random();

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        double random = rnd.nextDouble() * 10;
        this. setSzuperero(this.getSzuperero() + random);
    }

    @Override
    public boolean megmentiAVilagot() {
        boolean logikai = false;
        if (this.getSzuperero() >= 1000) {
            logikai = true;
        }
        return logikai;
    }

    @Override
    public String toString() {
        return String.format("%-10s %s", "Vasember", super.toString());
    }
}
