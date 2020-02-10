package com.java.test;

import com.java.main.Firewall;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FirewallTest {
    Firewall firewall;

    @Before
    public void setUp() throws IOException {
        firewall = new Firewall("input.csv");
    }

    @Test
    public void test1() {
        assertEquals(true, firewall.accept_packet("inbound", "tcp", 80, "192.168.1.2"));
    }

    @Test
    public void test2() {
        assertEquals(true, firewall.accept_packet("outbound", "tcp", 10001, "192.168.10.11"));
    }

    @Test
    public void test3() {
        assertEquals(true, firewall.accept_packet("inbound", "udp", 53, "192.168.1.1"));
    }

    @Test
    public void test4() {
        assertEquals(false, firewall.accept_packet("inbound", "tcp", 81, "192.168.1.2"));
    }
}
