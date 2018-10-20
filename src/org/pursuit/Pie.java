package org.pursuit;

class Pie {

    private String crust;
    private String pieFilling; // field variable made only in this class
    private int diameter;

    Pie() {
        this("filo dough", "cherry", 18);
    }

    Pie(String newCrust, String newPieFilling, int newDiameter) {
        crust = newCrust;
        pieFilling = newPieFilling;
        diameter = newDiameter;
    }

    public String getCrust() {
        return crust;
    }

    public String getPieFilling() {
        return pieFilling;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setPieFilling(String pieFilling) {
        this.pieFilling = pieFilling;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setCrust(String newCrust) {
        this.crust = newCrust;
    }

    public void pieIsBaked() {
        System.out.println("I am a " + pieFilling + " pie!");
    }
}