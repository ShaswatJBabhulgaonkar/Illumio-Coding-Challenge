package com.java.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IpAddress {
    private List<Integer> sR;
    private List<Integer> eR;

    public IpAddress(String iS) {
        if (iS.indexOf('-') != -1) {
            String[] ranges = iS.split("-");

            this.sR = Arrays
		                    .stream(ranges[0].split("\\."))
		                    .map(e -> Integer.parseInt(e))
		                    .collect(Collectors.toList());

            this.eR = Arrays
                            .stream(ranges[1].split("\\."))
                            .map(e -> Integer.parseInt(e))
                            .collect(Collectors.toList());
        }
        else {
            this.sR = this.eR = Arrays
                                    .stream(iS.split("\\."))
                                    .map(e -> Integer.parseInt(e))
                                    .collect(Collectors.toList());
        }
    }

    public boolean inIpRange(IpAddress inputIp) {
        for (int i=0; i<4; i++) {
            if (inputIp.sR.get(i) < this.sR.get(i) || inputIp.eR.get(i) > this.eR.get(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "IpAddress[" +
                "startIpRange=" + sR +
                ", endIpRange=" + eR +
                ']';
    }
}
