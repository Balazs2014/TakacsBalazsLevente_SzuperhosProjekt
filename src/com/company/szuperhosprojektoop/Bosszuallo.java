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
        if (this.szuperero < sz.mekkoraAzEreje() && this.vanEGyengesege) {
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
        return String.format("%f %s", this.szuperero, (this.vanEGyengesege ? "van gyengesége" : "nincs gyengesége"));
    }
}
