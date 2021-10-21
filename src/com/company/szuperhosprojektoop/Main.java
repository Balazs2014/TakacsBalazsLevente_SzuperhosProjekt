package com.company.szuperhosprojektoop;

public class Main {

    public static void main(String[] args) {
        Szuperhos sz1 = new Bosszuallo(10, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };
        Szuperhos sz2 = new Bosszuallo(15, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };

        System.out.println(sz1.legyoziE(sz2));
        System.out.println(sz1);
    }
}
