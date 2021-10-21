package com.company.szuperhosprojektoop;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos sz) {
        boolean logikai = false;
        double szupereroKetszeres = this.szuperero * 2;
        if (this.szuperero < sz.mekkoraAzEreje() && this.vanEGyengesege && sz instanceof Bosszuallo) {
            logikai = true;
        }
        if (szupereroKetszeres <= sz.mekkoraAzEreje() && sz instanceof Batman) {
            logikai = true;
        }
        return logikai;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return String.format("%14s: %.2f | %s", "ereje", this.szuperero, (this.vanEGyengesege ? "van gyengesége" : "nincs gyengesége"));
    }
}
