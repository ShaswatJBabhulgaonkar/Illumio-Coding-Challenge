package com.java.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Firewall {

    Set<Rule> rules;

    public Firewall(String filepath) throws IOException {
        rules = new HashSet<>();
        readFile(filepath);
    }

    private void readFile(String filepath) throws IOException {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
        	System.out.println(line);
            String[] strs = line.split(",");
            rules.add(new Rule(
                                strs[0],
                                strs[1],
                                strs[2],
                                strs[3]
                            ));
        }
    }

    public boolean accept_packet(String direction, String protocol, int port, String ip_address) {
        Rule r = new Rule(direction, protocol, String.valueOf(port), ip_address);
        Iterator<Rule> ri = rules.iterator();
        while (ri.hasNext()) {
            if (r.equals(ri.next())) {
                return true;
            }
        }

        return false;
    }
}
