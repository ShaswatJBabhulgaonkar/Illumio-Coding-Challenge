package com.java.main;

public class Rule {
    private String dir;
    private String pro;
    private Port port;
    private IpAddress ip;

    public Rule(String direction, String protocol, String port, String ip) {
        this.dir = direction;
        this.pro = protocol;
        this.port = new Port(port);
        this.ip = new IpAddress(ip);
    }

    @Override
    public String toString() {
        return "Rule[" +
                "direction='" + dir + '\'' +
                ", protocol='" + pro + '\'' +
                ", port=" + port +
                ", ip=" + ip +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rule inputRule = (Rule) o;

        return (
                inputRule.dir.equals(this.dir) &&
                inputRule.pro.equals(this.pro) &&
                inputRule.port.inPortRange(this.port) &&
                inputRule.ip.inIpRange(this.ip)
        );


    }
}
