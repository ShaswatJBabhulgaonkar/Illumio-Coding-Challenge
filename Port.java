package com.java.main;

public class Port {
    private int sR;
    private int eR;

    public Port(String portString) {
        if (portString.indexOf('-') != -1) {
        	sR = Integer.parseInt(portString.split("-")[0]);
        	eR = Integer.parseInt(portString.split("-")[1]);
        }
        else {
        	sR = Integer.parseInt(portString);
        	eR = Integer.parseInt(portString);
        }
    }

    public boolean inPortRange(Port port) {
        return port.sR >= this.sR && port.eR <= this.eR;
    }
}
