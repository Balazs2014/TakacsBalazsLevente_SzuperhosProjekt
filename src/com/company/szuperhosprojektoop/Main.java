package com.company.szuperhosprojektoop;


public class Main {

    public static void main(String[] args) {
        Szuperhos sz1 = new Bosszuallo(10, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };
        Szuperhos sz2 = new Bosszuallo(20, true) {
            @Override
            public boolean megmentiAVilagot() {
                return false;
            }
        };

        Vasember v1 = new Vasember(150, true);

        System.out.println(sz1.legyoziE(sz2));
        System.out.println(sz2.legyoziE(sz1));
        System.out.println(sz1);
        System.out.println(v1);
        System.out.println(v1.megmentiAVilagot());
    }
}
