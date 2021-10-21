package com.company.szuperhosprojektoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {
    public static ArrayList<Szuperhos> szereplok = new ArrayList<Szuperhos>();

    public static void szereplok(String fajlNev) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fajlNev));
            Vasember v;
            Batman b;
            String sor = br.readLine();
            while (sor != null) {
                String[] st = sor.split(" ");
                if (st[0].equals("Vasember")) {
                    v = new Vasember();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        v.kutyutKeszit();
                    }
                    szereplok.add(v);
                } else {
                    b = new Batman();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        b.kutyutKeszit();
                    }
                    szereplok.add(b);
                }

                sor = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void kiir() {
        for (Szuperhos item: szereplok) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        szereplok("szuperhos.txt");
        kiir();
    }
}
