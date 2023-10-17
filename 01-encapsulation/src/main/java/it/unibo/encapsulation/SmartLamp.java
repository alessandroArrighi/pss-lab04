package it.unibo.encapsulation;

public class SmartLamp {
    private boolean lampState;
    private String lampIntesity;
    private String lampColor;

    public SmartLamp(boolean lampState, String lampIntesity, String lampColor) {
        this.lampState = lampState;
        this.lampIntesity = lampIntesity;
        this.lampColor = lampColor;
    }
}