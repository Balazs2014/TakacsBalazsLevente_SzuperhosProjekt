package com.company.szuperhosprojektoop;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public boolean legyoziE(Szuperhos sz) {
        boolean logikai = false;
        if (sz.mekkoraAzEreje() < this.mekkoraAzEreje()) {
            logikai = true;
        }

        return logikai;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10s: %5.2f", "Batman", "leleményessége", this.lelemenyesseg);
    }
}
